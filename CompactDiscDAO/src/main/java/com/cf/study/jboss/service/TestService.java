package com.cf.study.jboss.service;

<<<<<<< Updated upstream
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

=======
import java.util.Set;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.cf.study.jboss.entities.CompactDisc;

>>>>>>> Stashed changes
public class TestService {

	public static void main(String[] args) {
		WeldContainer container = new Weld().initialize();
		CompactDiscService service = container.instance()
				.select(CompactDiscService.class).get();
<<<<<<< Updated upstream
		service.getCatalog();
=======

		Set<CompactDisc> discs = service.getCatalog();
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
>>>>>>> Stashed changes
	}

}
