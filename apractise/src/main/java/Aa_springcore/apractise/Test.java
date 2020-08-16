package Aa_springcore.apractise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
  //	Employee emp = (Employee) ctx.getBean("emp"); 
	
	 Employee bean = (Employee) ctx.getBean("emp"); 
	
		System.out.println("Employee ID :"+bean.getId());
		System.out.println("Employee Name :" +bean.getName());

	}

}
