package com.example.hellorestapi.Hellorestapi.resourcee;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

	@Path("getMessage")
	public class HelloResource {
		
		@GET
	    @Produces(MediaType.TEXT_PLAIN)
	   
		@Path("message1")
		public String getMessage()
	    {
	    	return "hello akshatha";
	    }
		
		@GET
	    @Produces(MediaType.TEXT_PLAIN)
		@Path("message2")
		public String getMessage2()
	    {
	    	return "hello jersey";
	    }
		
	}

