package com.nitt.careersitebackend.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.careersite.DAO.UsersDAO;
import com.niit.careersite.model.Users;

import junit.framework.Assert;


public class UsersTestCase {
	@Autowired
	static UsersDAO usersDAO;
	@Autowired
	static Users users;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.careersite");
		context.refresh();
		
		users=(Users)context.getBean("users");
		usersDAO=(UsersDAO)context.getBean("usersDAOImpl");
		
	}
	
	@Test
	public void saveTestCase()
	{
	    users.setUsername("YUGA");
	    users.setDob(null);
	   users.setAddress("hyd");
	   users.setGender("male");
	   users.setIsonline('m');
	   users.setMail("pothanamukesh@gmail.com");
	   users.setMobile("8374047404");
	   users.setPassword("mukesh@123");
	   users.setRole("ADMIN"); 
	   users.setIsonline('y');
	   
	    	
	Assert.assertEquals("save Test Case",true,usersDAO.saveOrUpdate(users));
	}

}
