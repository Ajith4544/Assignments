package assignment8;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class life implements InitializingBean , DisposableBean {
	
		public void afterPropertiesSet() throws Exception {
			System.out.println("Initializing bean using interfaces");
		}	
		public void destroy() throws Exception {
			System.out.println("Destroying the bean using interfaces");
		}

		public void Life(){
			System.out.println("Bean life cycle mtds using initializing and disposable bean ");
		}
}

