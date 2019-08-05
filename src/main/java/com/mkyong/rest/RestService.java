package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/api")
public class RestService {
	@GET
	@Path("/getTest")
	public Response getInfo() {
		return Response.status(200).build();
		}
	
	@GET
	@Path("/submitForm")
	public Response printMessage(@QueryParam("name") String name, @QueryParam("mood") String mood) {
		String output = "Your name is " + name + " and you are " + mood;
		return Response.status(200).entity(output).build();

		
	}

}

