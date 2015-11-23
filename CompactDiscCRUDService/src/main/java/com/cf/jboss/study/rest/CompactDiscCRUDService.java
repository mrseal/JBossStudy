package com.cf.jboss.study.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cf.jboss.study.rest.entities.CompactDisc;
import com.cf.jboss.study.rest.entities.CompactDiscs;

@Path("/compactdisc")
public class CompactDiscCRUDService {

	private static Map<Integer, CompactDisc> discs = new HashMap<>();

	static {
		discs.put(1, new CompactDisc(1, "FIFA 2016", "EA", 66));
		discs.put(2, new CompactDisc(2, "Shuang Jie Gun", "Jay", 36.1));
		discs.put(3, new CompactDisc(3, "World Records", "Gunnies", 106.6));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public CompactDiscs getCompactDiscs() {
		CompactDiscs discCollection = new CompactDiscs();
		discCollection.setDiscs(discs.values());
		return discCollection;
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CompactDisc getCompactDisc(@PathParam("id") int id) {
		return discs.get(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addCompactDisc(CompactDisc disc) {
		discs.put(disc.getId(), disc);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateCompactDisc(CompactDisc disc) {
		discs.put(disc.getId(), disc);
	}

	@DELETE
	@Path("{id}")
	public void removeCompactDisc(@PathParam("id") int id) {
		discs.remove(id);
	}

}
