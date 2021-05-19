package assignment9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class app {
	
	public void run() {
		System.out.println(" running");
	}
	
	public void init(){
	      System.out.println(" init");
	}
	
	@PostConstruct
	public void start(){
	      System.out.println(" started");
	}
	@PreDestroy
	public void end() {
	      System.out.println(" ends.");
	}
	
	public void destroy() {
	      System.out.println(" destroy ");
	}

}