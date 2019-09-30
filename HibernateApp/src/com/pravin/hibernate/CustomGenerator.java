package com.pravin.hibernate;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		Random random = new Random();
		int val = random.nextInt(10000);
		return new Integer(val);
	}

}
