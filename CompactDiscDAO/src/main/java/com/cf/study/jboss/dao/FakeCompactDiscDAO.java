package com.cf.study.jboss.dao;

import java.util.*;

import com.cf.study.jboss.entities.CompactDisc;

public class FakeCompactDiscDAO implements CompactDiscDAO {

	private static List<CompactDisc> fakeDiscs = new ArrayList<>();

	static {
		fakeDiscs.add(new CompactDisc("fakeTitle", "fakeArtist", 0.0));
	}

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("Fake Compact Disc DAO");
		return fakeDiscs;
	}

}
