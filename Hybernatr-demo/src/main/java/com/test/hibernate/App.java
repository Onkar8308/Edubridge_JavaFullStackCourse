package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.test.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	    	try
    	    	{
    	    		//Transaction -> session -> Session factory ->Standard Service Registry ->Standard Service Registry Builder -> configuration
    	        
    	    	org.hibernate.cfg.Configuration cfg= new org.hibernate.cfg.Configuration() .addResource("hibernate.hbm.xml")
    	    			.configure("hibernate.cfg.xml");
    	    	
    	    	StandardServiceRegistryBuilder registryBuilder=new StandardServiceRegistryBuilder();
    	    	registryBuilder.applySettings(cfg.getProperties());
    	    	
    	    	StandardServiceRegistry registry=registryBuilder.build();
    	    	
    	    	
    	    	SessionFactory sessionFactory=cfg.buildSessionFactory(registry);
    	    	Session session=sessionFactory.openSession();
    	    	
    	    	Transaction transaction=session.beginTransaction();
    	    		
    	    	Student student=new Student(11, "abc", "avc", "asd");
    	    	
    	    	session.save(student);
    	    	
    	    	transaction.commit();
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		System.out.println(e);
    	    	}
    	    	
    	    	
    	    }
  
}
