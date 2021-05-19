package assignment1;


	

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class test {

		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
			customer c1=(customer)context.getBean("customer");
			c1.printDetails();
		}

	}

