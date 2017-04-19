package com.gontuseries.university;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class UniversityRESTWS {
	
	@Path("/info")
	@GET 
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getXMLUniversityInfo(){
		
		return "Hello World";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
    public String getHTMLUniversityInfo(){
		
		String value="<html> " + "<title>" + "University Informtion" + "</title>"
		+"<body><h1>"+"NAME- INDIAN UNIVERSITY" +"</body></h1>" +"</html>";
		
		return value;
	}
	
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_HTML)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo){
		
		return "done successfully";
			
	}
	
	
	
	
	
	
	
	
	
	

}
