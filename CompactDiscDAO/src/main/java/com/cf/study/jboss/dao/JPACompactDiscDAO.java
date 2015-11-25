package com.cf.study.jboss.dao;

import java.util.Collection;
<<<<<<< Updated upstream

import com.cf.study.jboss.entities.CompactDisc;

public class JPACompactDiscDAO implements CompactDiscDAO {

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("JPA Compact Disc DAO");
		return null;
=======
import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.persistence.*;

import com.cf.study.jboss.entities.CompactDisc;

@Alternative
public class JPACompactDiscDAO implements CompactDiscDAO {

	private EntityManager entityManager;

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("JPA Compact Disc DAO");
		Query query = getEntityManager().createQuery("FROM CompactDisc");
		List<CompactDisc> discs = query.getResultList();
		return discs;
	}

	private EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("conygrePersistenceUnit");
			entityManager = factory.createEntityManager();
		}
		return entityManager;
>>>>>>> Stashed changes
	}

}
