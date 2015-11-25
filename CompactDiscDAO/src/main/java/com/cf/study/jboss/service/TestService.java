package com.cf.study.jboss.service;

import java.util.Set;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.cf.study.jboss.entities.CompactDisc;

public class TestService {

	public static void main(String[] args) {
		WeldContainer container = new Weld().initialize();
		CompactDiscService service = container.instance()
				.select(CompactDiscService.class).get();

		Set<CompactDisc> discs = service.getCatalog();
		for (CompactDisc disc : discs) {
			System.out.println(disc);
		}
	}

}
