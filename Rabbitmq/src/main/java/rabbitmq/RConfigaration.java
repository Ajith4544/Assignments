package rabbitmq;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RConfigaration
{
	public static final String topicExchangeName = "message_queue_exchange"; 
	public static final String queueName = "message_queue";
	
	@Bean
	Queue queue()
	{
		return new Queue(queueName, false);
	}
	
	@Bean
	TopicExchange exchange() 
	{
		return new TopicExchange(topicExchangeName);
	}
	
	@Bean
	Binding binding(Queue queue,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with("message_routing_key");
		
	}
	
	@Bean
	public ConnectionFactory connectionFactory()
	{
		CachingConnectionFactory connFactory=new CachingConnectionFactory("localhost");
		connFactory.setPort(5672);
		connFactory.setUsername("guest");
		connFactory.setPassword("guest");
		return connFactory;
	}
}

