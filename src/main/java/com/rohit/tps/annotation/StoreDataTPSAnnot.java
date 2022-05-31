package com.rohit.tps.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataTPSAnnot {

	public static void main(String[] args) {


		StandardServiceRegistry ssr=new  StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
				SessionFactory sf = meta.getSessionFactoryBuilder().build();
				Session s=sf.openSession();
				
				Transaction t=s.beginTransaction();
				
				StudentTPS e1=new StudentTPS();
				e1.setName("Rohit Misal");
				
				RegularStudentTPS rg1=new  RegularStudentTPS();
				rg1.setName("Balu Misal");
				rg1.setFees(80000);
				rg1.setDepartment("ComputerScience");
				
				CreditTransferStudentTPS ce1=new CreditTransferStudentTPS();
				ce1.setName("Aarti Misal");
				ce1.setDuration("8 months");
				ce1.setNoOfCredit(24);
				
				s.persist(e1);
				s.persist(rg1);
				s.persist(ce1);
				
				t.commit();
				s.close();
				System.out.println("Success");
				
	
	}

}
