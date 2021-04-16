package com.jit.spcrudoracle1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jit.spcrudoracle1.dao.EmployeeDao;
import com.jit.spcrudoracle1.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext
    			("applicationContext.xml");
    	EmployeeDao dao=(EmployeeDao)context.getBean("dao");
    	Employee employee=dao.getEmployee(1);
        System.out.println( "Hello World!" +employee);
    }
}
