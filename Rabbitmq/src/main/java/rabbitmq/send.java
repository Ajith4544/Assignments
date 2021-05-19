package rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class send implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(send.class, args);
	}
  // @Override
	public void run(String... args) throws Exception {
		
		  CustMgmt c2=new CustMgmt(); c2.setId(3); c2.setName("");
		 
		System.out.println("Sending message.....!!!!");
		rabbitTemplate.convertAndSend(RConfigaration.topicExchangeName, "message_routing_key", c2);
		
		System.out.println("done");
	}

}