package com.cf.study.jboss.service;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class TestService {

	public static void main(String[] args) {
		WeldContainer container = new Weld().initialize();
		CompactDiscService service = container.instance()
				.select(CompactDiscService.class).get();
		service.getCatalog();
	}

}
