package com.hibernate.example2;

/*
Listing 19.2a (Address.java) Simple Java Bean.
package com.hibernate.example1.example2;
 */
public class Address {
	private String addressLine1;
	private String city;
	private String state;
	private String country;

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

	public String toString() {
		return addressLine1 + "," + city + "," + state + "," + country;
	}
}