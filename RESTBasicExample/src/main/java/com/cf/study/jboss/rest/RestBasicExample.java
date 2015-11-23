package com.cf.study.jboss.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestBasicExample {

	@GET
	@Path("hello")
	public String sayHello() {
		return "Hello REST";
	}

	@GET
	@Path("hello/{name}")
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name;
	}

	@GET
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
	public Person showPerson() {
		return new Person("Mike", 26);
	}
	
	@POST
	@Path("addPerson")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPersion(Person person) {
		// some Data Layer operations
		System.out.println("Successfully created person" + person);
	}

}
