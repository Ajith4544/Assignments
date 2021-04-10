package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	private static ApplicationContext context;
public static void main(String[] args)
{
context = new ClassPathXmlApplicationContext("spring.xml");

Hellobean hellobean =(Hellobean) context.getBean("Hellobean");

hellobean.sayhello();
	
}
}
