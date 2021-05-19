package assignment8;


//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		context.registerShutdownHook();
		life2 b1=(life2)context.getBean("life2");
		b1.life();
	}
}
