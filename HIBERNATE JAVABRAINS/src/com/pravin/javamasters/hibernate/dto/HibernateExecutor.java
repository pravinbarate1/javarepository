package com.pravin.javamasters.hibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateExecutor {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Mercedes");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setVehicleName("Bike");
		twoWheeler.setSteeringHandle("Bike Steering Handle");

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVehicleName("Car");
		fourWheeler.setSteeringWheel("Porsche steering handle.");
		
		SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		session.getTransaction().commit();
		session.close();
	}

}
