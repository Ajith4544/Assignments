package assignment10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main{

	public static void Main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring10.xml");
		hello h1=(hello)context.getBean("helloWorld");
		h1.display();
	}
}

