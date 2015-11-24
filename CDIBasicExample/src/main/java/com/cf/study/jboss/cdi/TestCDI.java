package com.cf.study.jboss.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class TestCDI {
	public static void main(String[] args) {
		WeldContainer weldContainer = new Weld().initialize();
		Car car = weldContainer.instance().select(Car.class).get();
		weldContainer.instance().select(PoliceStation.class).get();
		weldContainer.instance().select(AARoadsideAssistant.class).get();
		car.getDriver().drive();
	}
}
