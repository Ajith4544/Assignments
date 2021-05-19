package assignment10;



import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class hello  implements ApplicationContextAware
{

	@SuppressWarnings("unused")
	private ApplicationContext context=null;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}
	public void display()
	{
		System.out.println("assignment 10");
	}
}