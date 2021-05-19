package assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class life3 {
	@PostConstruct
	public void myInit() throws Exception{
		System.out.println("Initializing bean using annotations");
	}
	 @PreDestroy
	 public void destroy() throws Exception{
		 System.out.println("Destroying bean using annotations");
	 }
	 
	 public void life()
	 {
		 System.out.println("Bean life cycle mtds");
	 } 
}