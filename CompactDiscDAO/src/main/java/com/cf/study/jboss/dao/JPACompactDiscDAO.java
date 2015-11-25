package com.cf.study.jboss.dao;

import java.util.Collection;

import com.cf.study.jboss.entities.CompactDisc;

public class JPACompactDiscDAO implements CompactDiscDAO {

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("JPA Compact Disc DAO");
		return null;
	}

}
