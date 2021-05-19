package assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void Main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("benas.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		life b1=(life)context.getBean("life");
		b1.Life();
	}
}

