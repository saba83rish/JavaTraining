/**
 * 
 */
package com.two95.java.Assignment7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Bincy
 *
 */
public class OverrideEqualHashCode
{


	public static void main(String[] args)
	{
	
		Student student1 = new Student("Arun","Singh","ArunSingh@two95.com","AHSD363");
		
		Student student2 = new Student("Bincy","Varghese","BincyVarghese@two95.com","HDWT239");
		
		Student student3 = new Student("Bincy","Jees","BincyJees@two95.com","HDWT239");
		
		Student student4 = new Student("Geo","George","GeoGeorge@two95.com","HDEY567");
		
		Student student5 = new Student("Johnu","Celestine","JohnuCelestine@two95.com","AJYB6374");
		
		Student student6 = new Student("John","John","Johnu@two95.com","AJYB6374");
		
		Student student7 = new Student("Sujith","Desai","SujithDesai@two95.com","DJAF369");
		
		
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		
		
		for(int i=0;i<studentList.size()-1;i++)
		{
			if(studentList.get(i).equals(studentList.get(i+1)))
			{
			
				System.out.println("student"+(i+1)+" and student"+(i+2)+" are same");
				
			}
			else
			{
				System.out.println("student"+(i+1)+" and student"+(i+2)+" are not same");
			}
		}
	
		
		HashMap<Integer, Student> mapStudent= new HashMap<Integer, Student>();
		
		mapStudent.put(student1.hashcode(),student1);
		mapStudent.put(student2.hashcode(),student2);
		mapStudent.put(student3.hashcode(),student3);
		mapStudent.put(student4.hashcode(),student4);
		mapStudent.put(student5.hashcode(),student5);
		mapStudent.put(student6.hashcode(),student6);
		mapStudent.put(student7.hashcode(),student7);
		
		System.out.println();
		System.out.println("Students in the School :"+mapStudent.size() );
		System.out.println();
		Collection<Student> uniquestudents= mapStudent.values();	
		
		Iterator<Student> itr= uniquestudents.iterator();
		
		while(itr.hasNext())
		{
			Student student = (Student)itr.next();
			System.out.println(student.firstName+"\t"+student.lastName+"\t"+student.emailID+"\t"+student.sSN);
		}
		
		}
				
	
	
}
