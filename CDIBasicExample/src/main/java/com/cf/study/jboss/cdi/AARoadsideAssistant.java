package com.cf.study.jboss.cdi;

import javax.enterprise.event.Observes;

public class AARoadsideAssistant {

	public void onCarCrash(@Observes Crash crash) {
		System.out.println("The AA roadside assistant is on the way");
	}

}