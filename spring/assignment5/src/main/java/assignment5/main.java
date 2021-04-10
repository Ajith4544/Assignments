package assignment5;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
	//private static ApplicationContext context;
    public static void Main(String[] args) {
	// context = new ClassPathXmlApplicationContext("beans.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Circle c1=(Circle)context.getBean("Circle");
		c1.getInfo();
	}
}