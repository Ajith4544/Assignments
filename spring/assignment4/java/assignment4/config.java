package assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	
	@Bean
	public a a1()
	{
		return new a();
	}
}
