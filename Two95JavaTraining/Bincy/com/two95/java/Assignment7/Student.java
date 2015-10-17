/**
 * 
 */
package com.two95.java.Assignment7;

/**
 * @author Bincy
 *
 */
public class Student
{
	String firstName;
	String lastName;
	String emailID;
	String sSN;
	
	
	
	Student(String firstName,String lastName,String emailID,String sSN)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailID=emailID;
		this.sSN=sSN;
		
		
	}
	
	
	public boolean equals(Object obj)
	{
		
		//check whether the object passes is Student object
		if(!(obj instanceof Student))
			return false;
		
		
		
		//to avoid null pointer exception
		if(this.sSN==null)
			return false;
		
		
		Student studentObj=(Student) obj;
		
		
		//use built in equals method
		if(this.sSN.equals(studentObj.sSN))
			return true;
		else
			return false;
		
	}
	
	public int hashcode()
	{
		if(this.sSN==null)
			return 333;
		else
			//use inbuilt hashcode method
		return sSN.hashCode();
		
	}
	

}
