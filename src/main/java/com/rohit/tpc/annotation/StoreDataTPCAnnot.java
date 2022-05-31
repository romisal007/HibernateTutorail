package com.rohit.tpc.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataTPCAnnot {

	public static void main(String[] args) {


		StandardServiceRegistry ssr=new  StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
				SessionFactory sf = meta.getSessionFactoryBuilder().build();
				Session s=sf.openSession();
				
				Transaction t=s.beginTransaction();
				
				StudentTPC e1=new StudentTPC();
				e1.setName("Rohit");
				
				RegularStudentTPC rg1=new  RegularStudentTPC();
				rg1.setName("Balu");
				rg1.setFees(50000);
				rg1.setDepartment("ComputerScience");
				
				CreditTransferStudentTPC ce1=new CreditTransferStudentTPC();
				ce1.setName("Aarti Misal");
				ce1.setDuration("6 months");
				ce1.setNoOfCredit(20);
				
				s.persist(e1);
				s.persist(rg1);
				s.persist(ce1);
				
				t.commit();
				s.close();
				System.out.println("Success");
				
	
	}

}
