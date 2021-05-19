package assignment8;




import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8-3.xml");
		context.registerShutdownHook();
		life3 b1=(life3)context.getBean("Life3");
		b1.life();
	}
}

