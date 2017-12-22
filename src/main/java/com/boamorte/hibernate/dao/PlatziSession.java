package com.boamorte.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {
	private Session session;
	
	public PlatziSession() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();			
		} catch(Exception e) {
			System.out.println("Error al crear la sessión: " + e.getMessage());
		}
	}

	public Session getSession() {
		return session;
	}
}
