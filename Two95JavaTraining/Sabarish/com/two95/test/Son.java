package com.two95.test;

import com.two95.java.House;

public class Son extends House{

	public void accessKitchen() {
		kitchen="Son";
		diningRoom="Son";
		System.out.println(kitchen);
	}
	
	public static void main(String[] args) {
		House.car="Honda";
		House house = new House();
		//house.kitchen="Maid";
		house.livingRoom="Maid";
		house.watchTelevision();
		//house.cook();
		

	}

}
