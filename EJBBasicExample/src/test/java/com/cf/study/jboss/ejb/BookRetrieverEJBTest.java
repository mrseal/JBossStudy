package com.cf.study.jboss.ejb;

import static org.junit.Assert.*;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class BookRetrieverEJBTest {

	@EJB
	private BookRetriever retriever;

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap
				.create(JavaArchive.class, "ejb-test.jar")
				.addClasses(Book.class, BookRetriever.class,
						BookRetrieverEJB.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@Test
	public void test() {
		Book book = retriever.getBookByID(2);
		assertEquals("Linux Desk Reference", book.getTitle());
	}

}
