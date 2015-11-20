package com.hibernate.example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Customer customer = new Customer();
			customer.setFirstName("James");
			customer.setLastName("Bond");
			customer.setSsn(999997);

			Address address = new Address();
			address.setAddressLine1("1112 S St");
			address.setCity("London");
			address.setState("LDN");
			address.setCountry("UK");
			customer.setAddress(address);
			session.save(customer);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
