package com.sidhant.datastructures;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcHmapExample {
static Map<String,Long> orders= new ConcurrentHashMap<>();
	static void processOrders(){
		for(String city: orders.keySet())
			for (int i=0;i<50;i++)
			{
				Long oldOrder= orders.get(city);
				orders.put(city, oldOrder+1);
			}
	}
public static void main(String[] args) throws InterruptedException {
		orders.put("Bombay", 0l);
		orders.put("Beijing", 0l);
		orders.put("London", 0l);
		orders.put("New Work", 0l);
		
		ExecutorService service= Executors.newFixedThreadPool(2);
		service.submit(ConcHmapExample::processOrders);
		service.submit(ConcHmapExample::processOrders);
		
		service.awaitTermination(1,TimeUnit.SECONDS);
		service .shutdown();
		
		System.out.println(orders);
		
	}

}
