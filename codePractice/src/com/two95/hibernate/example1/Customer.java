package com.hibernate.example1;

/*
 * CUSTOMERS TABLE
	Customer
	String : firstName
	String : lastName
	long : SSN
	String : addressLine1
	String : city
 * @author: Sujit H. Desai
 */
public class Customer {
	private String firstName;
	private String lastName;
	private int ssn;
	private String addressLine1;
	private String city;
	private String state;
	private String country;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNamme) {
		this.lastName = lastNamme;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;

		/* Chapter 19 Mapping Beans to Tables Hibernate Page #599 */
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}