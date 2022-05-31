package com.rohit.tph.usingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataTPH {

	public static void main(String[] args) {


		StandardServiceRegistry ssr=new  StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
				SessionFactory sf = meta.getSessionFactoryBuilder().build();
				Session s=sf.openSession();
				
				Transaction t=s.beginTransaction();
				
				EmployeeTPH e1=new EmployeeTPH();
				e1.setName("Rohit");
				
				RegularEmployeeTPH rg1=new  RegularEmployeeTPH();
				rg1.setName("Balu");
				rg1.setSalary(50000);
				rg1.setBonus(5);
				
				ContractEmployeeTPH ce1=new ContractEmployeeTPH();
				ce1.setName("Aarti Misal");
				ce1.setContractDuration("15 hours");
				ce1.setPayPerHour(1000);
				
				s.persist(e1);
				s.persist(rg1);
				s.persist(ce1);
				
				t.commit();
				s.close();
				System.out.println("Success");
				
	
	}

}
