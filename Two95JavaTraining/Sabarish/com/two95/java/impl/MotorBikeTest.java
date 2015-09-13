package com.two95.java.impl;

import com.two95.java.interfaces.Drive;
import com.two95.java.interfaces.Stop;

public class MotorBikeTest {

	public static void main(String[] args) {
		MotorBike bike = new MotorBike();
		bike.drive();
		bike.stop();
		
		Drive driveBike = new MotorBike();
		driveBike.drive();
		Stop stopBike = new MotorBike();
		stopBike.stop();

	}

}
