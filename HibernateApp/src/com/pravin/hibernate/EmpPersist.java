package com.pravin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpPersist {

			
	public static void main(String[] args) throws InterruptedException {

		
		Configuration cfg = new Configuration();
		
		cfg = cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		EmpBean empBean = new EmpBean();
		empBean.setEid(101);
		empBean.setfName("piyush");
		empBean.setlName("jagtap");
		empBean.setMail("piyush@gmail.com");
		
		Transaction transaction = session.beginTransaction();
		
		/*EmpBean empBean = new EmpBean();
		empBean.setEid(101);
		empBean.setfName("Pravin");
		EmpBean e1 = (EmpBean)session.get(EmpBean.class, empBean);
		System.out.println(e1);
		
		e1.setMail("pravin123@gmail.com");
		session.update(e1);*/
		//int retVal = (Integer)session.save(empBean);
		//session.update(empBean);
		//EmpBean e1 = (EmpBean)session.merge(empBean);
		//empBean.setlName("Barate");
		//empBean.setMail("pravin@gmail.com");
		//System.out.println(e1.toString());
		//System.out.println("Retval = "+retVal);
		//session.saveOrUpdate(empBean);
		//session.delete(empBean);
		//transaction.commit();
		//System.out.println(empBean);
		//EmpBean eb = (EmpBean)session.load(EmpBean.class,empBean);
		//System.out.println(empBean.getfName());
		//System.out.println(eb);
		/*Thread.sleep(40000);
		session.refresh(empBean);
		System.out.println(empBean);
		//empBean.setMail("pavi123@gmail.com");
		session.flush();*/
		Integer id = (Integer)session.save(empBean);
		System.out.println("generated id value = "+id);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Record Saved successfully in db...");
	}

}
