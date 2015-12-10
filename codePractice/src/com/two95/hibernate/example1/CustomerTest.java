package com.hibernate.example1;

/*Listing 19.1d (CustomerTest) Test class. */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Oracle12cDialect;

public class CustomerTest {
	/*
	 * Chapter 19 Mapping Beans to Tables Hibernate 602
	 */public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Customer customer = new Customer();
			customer.setFirstName("James");
			customer.setLastName("Bond");
			customer.setSsn(999998);
			customer.setAddressLine1("1111 S St");
			customer.setCity("London");
			customer.setState("LDN");
			customer.setCountry("UK");
			session.save(customer);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
		}
	}
}