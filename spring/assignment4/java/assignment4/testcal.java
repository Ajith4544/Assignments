package assignment4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testcal {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext();
		context.scan("assignment4");
		context.refresh();
		calculator cal=(calculator)context.getBean("cal");
		int a=cal.add(5, 10);
		System.out.println("Addition of 5 and 10 is: "+a);
		int b=cal.sub(11, 6);
		System.out.println("Subtraction of 11 and 6 is: "+b);
		int c=cal.mul(5, 10);
		System.out.println("multiplication of 5 and 10 is: "+c);
		int d=cal.div(12, 6);
		System.out.println("division of 11 and 6 is: "+d);
	}
}
