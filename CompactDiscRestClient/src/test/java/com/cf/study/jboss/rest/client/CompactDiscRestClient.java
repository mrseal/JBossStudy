package com.cf.study.jboss.rest.client;

import static org.junit.Assert.*;

import java.util.Collection;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import org.junit.Before;
import org.junit.Test;
import com.cf.jboss.study.rest.entities.CompactDisc;
import com.cf.jboss.study.rest.entities.CompactDiscs;

public class CompactDiscRestClient {

	private Client client;
	private WebTarget target;

	@Before
	public void init() {
		client = ClientBuilder.newClient();
		target = client
				.target("http://127.0.0.1:8080/CompactDiscCRUDService-1.0.1-SNAPSHOT/rest/compactdisc");
		System.out.println("@Test");
	}

	@Test
	public void testGetCompactDiscs() {
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
				.get();
		Collection<CompactDisc> discs = response.readEntity(CompactDiscs.class)
				.getDiscs();
		assertTrue(discs.size() > 0);
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
	}

	@Test
	public void testGetCompactDisc() {
		target = client
				.target("http://127.0.0.1:8080/CompactDiscCRUDService-1.0.1-SNAPSHOT/rest/compactdisc/1");
		Response response = target.request().get();
		CompactDisc disc = response.readEntity(CompactDisc.class);
		assertNotNull(disc);
		System.out.println(disc);
	}

	@Test
	public void testAddAndRemoveCompactDisc() {
		CompactDisc newDisc = new CompactDisc(7, "testDisc", "testAuthor",
				1921.3);
		target.request().post(Entity.json(newDisc));
		Response response = target.request().get();
		Collection<CompactDisc> discs = response.readEntity(CompactDiscs.class)
				.getDiscs();
		assertTrue(discs.size() > 0);
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}

		target = client
				.target("http://127.0.0.1:8080/CompactDiscCRUDService-1.0.1-SNAPSHOT/rest/compactdisc/7");
		target.request().delete();

		target = client
				.target("http://127.0.0.1:8080/CompactDiscCRUDService-1.0.1-SNAPSHOT/rest/compactdisc");
		response = target.request().get();
		discs = response.readEntity(CompactDiscs.class).getDiscs();
		assertTrue(discs.size() > 0);
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
	}

	@Test
	public void testUpdateCompactDisc() {
		CompactDisc updatedDisc = new CompactDisc();
		updatedDisc.setId(1);
		updatedDisc.setName("updatedName");
		target.request().put(Entity.json(updatedDisc));

		Response response = target.request().get();
		Collection<CompactDisc> discs = response.readEntity(CompactDiscs.class)
				.getDiscs();
		assertTrue(discs.size() > 0);
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
	}
}
