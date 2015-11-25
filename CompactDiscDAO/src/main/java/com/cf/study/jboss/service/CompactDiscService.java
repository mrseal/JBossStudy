package com.cf.study.jboss.service;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import com.cf.study.jboss.dao.CompactDiscDAO;
import com.cf.study.jboss.entities.CompactDisc;

public class CompactDiscService {

	@Inject
	private CompactDiscDAO dao;

	public Set<CompactDisc> getCatalog() {
		Set<CompactDisc> discs = new HashSet<CompactDisc>();
		dao.getAllDiscs();
//		discs.addAll(dao.getAllDiscs());
		return discs;
	}

}
