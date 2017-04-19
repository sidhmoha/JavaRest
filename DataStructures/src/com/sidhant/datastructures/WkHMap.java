package com.sidhant.datastructures;

import java.util.Map;
import java.util.WeakHashMap;

public class WkHMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Order,Integer> orders=new WeakHashMap<>();
		
		orders.put(new Order(1,"hello"), 100);
		orders.put(new Order(2,"hello"), 200);
		Order od=new Order(3,"hello");
		orders.put(od, 300);
		
		
		System.out.println(orders.size());
		System.gc();
		System.out.println(orders.size());
			
	}
}

class Order{
	int orderId;
	String details;
	public Order(int anId,String theDetails){
		orderId=anId;
		details=theDetails;
	}
}
