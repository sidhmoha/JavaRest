package com.mkyong.rest;

//import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.FormParam;
//import com.sun.research.ws.wadl.Response;

@Path("/hello")
public class RestHello {
	/*
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;
		//return output;
		return Response.status(200).entity(output).build();

	}
*/
	
	/*
	@GET
	@Path("/query")
	public Response getUsers(
		@QueryParam("from") int from,
		@QueryParam("to") int to,
		@QueryParam("orderBy") List<String> orderBy) {

		return Response
		   .status(200)
		   .entity("getUsers is called, from : " + from + ", to : " + to
			+ ", orderBy" + orderBy.toString()).build();
	}
	*/
	
	@POST
	@Path("/add")
	public Response addUser(
		@FormParam("name") String name,
		@FormParam("age") int age) {

		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + age)
			.build();

	}
}
