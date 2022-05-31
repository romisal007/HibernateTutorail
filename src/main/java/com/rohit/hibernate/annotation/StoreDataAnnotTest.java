package com.rohit.hibernate.annotation;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataAnnotTest {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session s=factory.openSession();
		Transaction ts=s.beginTransaction();
		
		EmployeeAnnot e=new EmployeeAnnot();
		e.setId(2);
		e.setFirstName("Aarti");
		e.setLastName("Misal");
		s.save(e);
		ts.commit();
		System.out.println("Saved Successfully");
		factory.close();
		s.close();
		
	}
}
