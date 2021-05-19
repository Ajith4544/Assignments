package assignment4;

import org.springframework.context.ApplicationContext;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	//private static ApplicationContext context;
    public static void Main(String[] args) {
	// context = new AnnotationConfigApplicationContext(config.class);
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	a a1=context.getBean(a.class);
		a1.display("@bean and @config example ");
		
	}
}

