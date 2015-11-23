package com.cf.study.jboss.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class RestBasicExample {

	@GET
	public String sayHello() {
		return "Hello REST";
	}

}
