package com.cf.study.jboss.jpa.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

public class TestJPA {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("conygrePersistenceUnit");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// CompactDisc disc = new CompactDisc("Fantasy", "Jay", 56.9);
		// em.persist(disc);

		Query query = em.createQuery("from CompactDisc");
		List<CompactDisc> discs = query.getResultList();

		tx.commit();
		em.close();

		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
		
	}

}
