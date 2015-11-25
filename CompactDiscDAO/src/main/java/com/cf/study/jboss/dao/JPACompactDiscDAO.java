package com.cf.study.jboss.dao;

import java.util.Collection;
import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.persistence.*;

import com.cf.study.jboss.entities.CompactDisc;

@Alternative
public class JPACompactDiscDAO implements CompactDiscDAO {

	private EntityManagerFactory emFactory;

	public JPACompactDiscDAO() {
		emFactory = Persistence.createEntityManagerFactory("conygrePersistenceUnit");
	}

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("JPA Compact Disc DAO");
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query query = getEntityManager().createQuery("FROM CompactDisc");
		List<CompactDisc> discs = query.getResultList();
		tx.commit();
		safeClose(em);
		return discs;
	}

	private EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

	private void safeClose(EntityManager em) {
		if (em != null) {
			em.close();
		}
	}

}
