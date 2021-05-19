package assignment9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
	//public static ApplicationContext context;
	
	public static void Main(String[] args) {
		//context = new ClassPathXmlApplicationContext("beans.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		app obj = (app) context.getBean("App");
		obj.run();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}