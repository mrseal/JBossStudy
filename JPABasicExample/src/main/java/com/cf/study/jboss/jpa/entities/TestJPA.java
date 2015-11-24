package com.cf.study.jboss.jpa.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

public class TestJPA {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conygrePersistenceUnit");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// CompactDisc newdisc = new CompactDisc("Fantasy", "Jay", 56.9);
		// newdisc.addTrack(new Track("Love Before BC"));
		// newdisc.addTrack(new Track("Dad, I'm back"));
		// newdisc.addTrack(new Track("Ninja"));
		// em.persist(newdisc);

		Query query = em.createQuery("FROM CompactDisc WHERE title='Fantasy'");
		List<CompactDisc> discs = query.getResultList();
		for (CompactDisc disc : discs) {
			System.out.println(disc.getId() + " : " + disc.getTitle());
		}

		// Query allFantasyTracks = em.createQuery("SELECT t.title FROM Track t
		// WHERE t.disc.id=121");
		// List<String> tracks = allFantasyTracks.getResultList();
		// for (String track : tracks) {
		// System.out.println(track);
		// }

		Query namedQuery = em.createNamedQuery("findByTitle");
		namedQuery.setParameter("discId", 121);
		List<String> tracks = namedQuery.getResultList();
		for (String track : tracks) {
			System.out.println(track);
		}

		tx.commit();
		em.close();
	}

}
