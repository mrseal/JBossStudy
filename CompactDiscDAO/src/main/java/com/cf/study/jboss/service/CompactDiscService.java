package com.cf.study.jboss.service;

import java.util.Collection;

import javax.inject.Inject;

import com.cf.study.jboss.dao.CompactDiscDAO;
import com.cf.study.jboss.entities.CompactDisc;

public class CompactDiscService {

	@Inject
	private CompactDiscDAO dao;

	public Collection<CompactDisc> getCatalog() {
		return dao.getAllDiscs();
	}

}
