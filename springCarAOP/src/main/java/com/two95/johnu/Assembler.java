package com.two95.johnu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assembler {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Car GenericCar = (Car) context.getBean("GenericCar");
		System.out.println(GenericCar);
		GenericCar.drive();
		
		Car MichelinCar = (Car) context.getBean("MichelinCar");
		System.out.println(MichelinCar);
		MichelinCar.drive();
		
		Bike MotorBike = (Bike) context.getBean("Bike");
		MotorBike.drive();
		
		context.close();
	}
}
