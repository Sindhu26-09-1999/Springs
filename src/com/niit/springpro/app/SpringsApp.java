package com.niit.springpro.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.springpro.models.Employee;                                                          
public class SpringsApp
{

	public static void main(String[] args)
     {
	   ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
	   Employee employee = (Employee)context.getBean("employee");
	   System.out.println("EmployeeId  " +employee.getEmployeeId());
	   System.out.println("EmployeeName "+employee.getEmployeeName());
	   System.out.println("Employee Age "+employee.getEmployeeAge());
    	 		
     }
}


