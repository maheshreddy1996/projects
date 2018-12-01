package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
       private static  SessionFactory factory;
       static {
    	   try {
    	      Configuration cfg=null;
    	      cfg=new Configuration();
    	      cfg=cfg.configure("com/nt/cfg/hibernate.cfg.xml");
    	      factory=cfg.buildSessionFactory();
    	   }
    	   catch(HibernateException he) {
    		   he.printStackTrace();
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
       public static Session getSession() {
    	   Session ses=factory.openSession();
    	   return ses;
       }
       public static void  closeSession(Session ses) {
    	    ses.close();
       }
       public static void closeSessionFactory() {
    	   factory.close();
       }
}
