package com.cf.study.jboss.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class GoogleDriver implements Driver {

	public void drive() {
		System.out.println("Google Driver");
	}

}
