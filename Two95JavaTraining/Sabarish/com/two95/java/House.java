package com.two95.java;

public class House {
	
	public House() {
		System.out.println("House is initialized");
	}
	
	public House(String color) {
		System.out.println(color + " House is initialized");
	}
	
	 private String houseOwner;
	protected static String car;
	public String livingRoom;
	protected String kitchen;
	private String masterBedroom;
	protected String diningRoom;
	
	  private void sleep() {
		 System.out.println("The family sleeps  here");
	 }

	 protected void cook() {
		 System.out.println("The "+kitchen+" cooks  here");
	 }
	 
	 public void watchTelevision() {
		 System.out.println("The "+livingRoom+" watches TV  here");
	 }
	 
	 protected void eats() {
		 System.out.println("The family eats here");
	 }
	public static void main(String[] args) {

	}

	/**
	 * @return the houseOwner
	 */
	public String getHouseOwner() {
		return houseOwner;
	}

	/**
	 * @param houseOwner the houseOwner to set
	 */
	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}

	/**
	 * @return the diningRoom
	 */
	public String getDiningRoom() {
		return diningRoom;
	}

	/**
	 * @param diningRoom the diningRoom to set
	 */
	public void setDiningRoom(String diningRoom) {
		this.diningRoom = diningRoom;
	}

}
