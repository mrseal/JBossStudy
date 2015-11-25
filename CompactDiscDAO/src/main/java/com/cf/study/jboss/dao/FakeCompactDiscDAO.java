package com.cf.study.jboss.dao;

<<<<<<< Updated upstream
import java.util.Collection;
=======
import java.util.*;
>>>>>>> Stashed changes

import com.cf.study.jboss.entities.CompactDisc;

public class FakeCompactDiscDAO implements CompactDiscDAO {

<<<<<<< Updated upstream
	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("Fake Compact Disc DAO");
		return null;
=======
	private static List<CompactDisc> fakeDiscs = new ArrayList<>();

	static {
		fakeDiscs.add(new CompactDisc("fakeTitle", "fakeArtist", 0.0));
	}

	public Collection<CompactDisc> getAllDiscs() {
		System.out.println("Fake Compact Disc DAO");
		return fakeDiscs;
>>>>>>> Stashed changes
	}

}
