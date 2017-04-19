package com.sidhant.client.RestClient;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sidhant.client.RestClient.dao.DBHelper;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/	myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	
    	/*
    	System.out.println("Inside Hello ************");
    	ResultSet rs=DBHelper.getKillerTomato();
        try {
			return rs.getString(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		*/
    	return "hello World";
		
    }
}
