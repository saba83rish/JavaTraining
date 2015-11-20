package com.hibernate.example2;
/*
Listing 19.2b (Customer.java) Simple Java Bean.
package com.hibernate.example1.example2;
*/
public class Customer {
private String firstName;
private String lastName;
private int ssn;
/*Chapter 19 Mapping Beans to Tables
Hibernate
605
*/
private Address address;
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
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
}
public String toString() {
return firstName + "," + lastName + "," + ssn + "," + address;
}
}