package com.two95.java;

public class Maid {

	public static void main(String[] args) {
		House house = new House();
		house.kitchen="Maid";
		house.livingRoom="Maid";
		house.watchTelevision();
		house.cook();
		house.setHouseOwner("MAID 2.0");
		System.out.println(house.getHouseOwner());

	}

}
