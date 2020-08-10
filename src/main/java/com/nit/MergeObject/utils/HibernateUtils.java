package com.nit.MergeObject.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
		private static SessionFactory factory;
		private static Session ses;
		static
		{
			factory=new Configuration().configure("com/nit/MergeObject/cfgs/hibernate.cfg.xml").buildSessionFactory();
		}
		
		public static Session getSession()
		{
			ses=factory.openSession();
			return ses;
			
		}
		public static void closeSession()
		{
			ses.close();
		}
		public static void closeSessionFactory()
		{
			factory.close();
		}
	}


