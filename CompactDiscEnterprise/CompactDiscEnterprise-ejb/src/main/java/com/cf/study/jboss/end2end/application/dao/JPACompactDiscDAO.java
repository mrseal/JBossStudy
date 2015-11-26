package com.cf.study.jboss.end2end.application.dao;

import java.util.Collection;

import javax.ejb.*;
import javax.persistence.*;

import com.cf.study.jboss.end2end.application.entities.CompactDisc;

@Stateless
public class JPACompactDiscDAO implements CompactDiscDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	public Collection<CompactDisc> getAllDiscs() {
		Query query = em.createQuery("FROM CompactDisc");
		return query.getResultList();
	}

}
