package assignment2;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
    context = new ClassPathXmlApplicationContext("beans.xml");
		collection coll = (collection) context.getBean("collection");

		coll.showList();
	    coll.showSet();
		coll.showMap();
	}

}