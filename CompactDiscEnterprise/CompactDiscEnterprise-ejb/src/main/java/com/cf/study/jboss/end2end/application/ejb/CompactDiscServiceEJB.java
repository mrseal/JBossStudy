package com.cf.study.jboss.end2end.application.ejb;

import java.util.Arrays;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.cf.study.jboss.end2end.application.dao.CompactDiscDAO;
import com.cf.study.jboss.end2end.application.entities.CompactDisc;

@Stateless
public class CompactDiscServiceEJB implements CompactDiscService {

	@Inject
	private CompactDiscDAO dao;

	@Override
	public Collection<CompactDisc> getCatalog() {
		return dao.getAllDiscs();
	}

}
