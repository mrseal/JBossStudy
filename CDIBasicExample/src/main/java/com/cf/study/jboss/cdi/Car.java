package com.cf.study.jboss.cdi;

import javax.inject.Inject;

public class Car {

	@Inject
	@Biological
	private Driver driver;

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
