package com.two95.johnu;

public class Car {
	
//	private Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [makeOfTire=" + makeOfTire + ", color=" + color + "]";
	}

	private GenericTire makeOfTire;
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public Car(GenericTire tire){
//		this.engine=engine;
		this.makeOfTire=tire;
		//System.out.println("Make of the tire is: "+tire.getMakeOfTire());
	}
	
	public void drive(){
//		engine.startEngine();
		System.out.println("I am driving the " +color+ " car with "+ makeOfTire.getMakeOfTire() +" tire");
//		engine.stopEngine();
	}
}
  