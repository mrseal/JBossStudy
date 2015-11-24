package com.cf.study.jboss.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestLifecycle {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conygrePersistenceUnit");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Query query = em.createQuery("FROM CompactDisc WHERE id=121");
		CompactDisc disc = (CompactDisc) query.getSingleResult();
		System.out.println(disc.getTitle());

		tx.commit();
		em.close();

		disc.setTitle("Fantasy");

		EntityManager em2 = factory.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		tx2.begin();
		em2.merge(disc);
		tx2.commit();
		em2.close();

		factory.close();
	}

}
