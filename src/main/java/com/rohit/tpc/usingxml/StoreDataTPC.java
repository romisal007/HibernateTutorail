package com.rohit.tpc.usingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataTPC {

	public static void main(String[] args) {


		StandardServiceRegistry ssr=new  StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
				SessionFactory sf = meta.getSessionFactoryBuilder().build();
				Session s=sf.openSession();
				
				Transaction t=s.beginTransaction();
				
				EmployeeTPC e1=new EmployeeTPC();
				e1.setName("Rohit");
				
				RegularEmployeeTPC rg1=new  RegularEmployeeTPC();
				rg1.setName("Balu");
				rg1.setSalary(50000);
				rg1.setBonus(5);
				
				ContractEmployeeTPC ce1=new ContractEmployeeTPC();
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
