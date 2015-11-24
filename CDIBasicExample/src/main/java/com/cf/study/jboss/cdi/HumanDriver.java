package com.cf.study.jboss.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

@Biological
public class HumanDriver implements Driver {

	@Inject
	private Event<Crash> crashEvent;

	public void drive() {
		System.out.println("Human Driver");
		crashEvent.fire(new Crash(60));
		System.out.println("Journey finished");
	}

}
