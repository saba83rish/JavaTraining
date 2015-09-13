package com.two95.java.collections;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Integer ssn;
	
	public int compareTo(Customer c1) {
		return this.ssn.compareTo(c1.ssn);
		
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the ssn
	 */
	public Integer getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	

}
