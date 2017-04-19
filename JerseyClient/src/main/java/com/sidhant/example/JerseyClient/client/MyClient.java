package com.sidhant.example.JerseyClient.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class MyClient {

	public 	static void main(String[] args){
		Client client= ClientBuilder.newClient();
		
		String result= client.target("http://localhost:8080/JerseyClient/webapi/myresource").request().get(String.class);
		
		System.out.println(result);
	}
	
	
}