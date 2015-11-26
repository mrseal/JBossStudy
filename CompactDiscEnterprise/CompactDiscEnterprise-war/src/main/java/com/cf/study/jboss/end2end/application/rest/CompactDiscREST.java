package com.cf.study.jboss.end2end.application.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cf.study.jboss.end2end.application.ejb.CompactDiscService;
import com.cf.study.jboss.end2end.application.entities.CompactDisc;

@Path("/compactdisc")
public class CompactDiscREST {

	@Inject
	private CompactDiscService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<CompactDisc> getAllDiscs() {
		return service.getCatalog();
	}

}
