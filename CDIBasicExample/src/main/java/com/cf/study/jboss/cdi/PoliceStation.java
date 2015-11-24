package com.cf.study.jboss.cdi;

import javax.enterprise.event.Observes;

public class PoliceStation {

	public void onCarCrash(@Observes Crash crash) {
		System.out
				.println("The police station has been notified of the car crash [value = "
						+ crash.getDamage() + "]");
	}

}
