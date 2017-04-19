	package com.sidhant.sampletutorial.messege.exception;

	import javax.ws.rs.core.Response;
	import javax.ws.rs.core.Response.Status;
	import javax.ws.rs.ext.ExceptionMapper;
	import javax.ws.rs.ext.Provider;

	import com.sidhant.sampletutorial.messege.model.ErrorMessage;


	@Provider
	public class GenereicExceptionMapper implements ExceptionMapper<Throwable> {

		@Override
		public Response toResponse(Throwable ex) {
			// TODO Auto-generated method stub
			ErrorMessage errorMessage= new ErrorMessage(ex.getMessage(),500,"http://google.com");
			
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
		}
		

	}
