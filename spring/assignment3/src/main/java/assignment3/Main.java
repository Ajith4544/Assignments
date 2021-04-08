package assignment3;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Controller b1=(Controller)context.getBean("Controller");
		double bal=b1.getBalance(1111);
		System.out.println("Initial balance: "+bal);
		double value=b1.deposit(1111, 500);
		System.out.println("After depositing 500 :"+value);
		double bala=b1.getBalance(1111);
		System.out.println("Balance: "+bala);
		double value1=b1.deposit(1111, 1500);
		System.out.println("After depositing 1500: "+value1);
		double value2=b1.withdraw(1111, 250);
		System.out.println("After withdraw 250: "+value2);	
	}
}