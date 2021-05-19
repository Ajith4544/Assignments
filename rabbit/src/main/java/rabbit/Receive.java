package rabbit;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rabbitmq.client.Channel;

@Component
@RestController
public class Receive implements ChannelAwareMessageListener
{
	
	@Autowired
	private service custSer;
	
	@GetMapping("/customer")
	public List<CustMgmt> getAllCustomer()
	{
		return custSer.getAllCustomer();
	}

	//@Override
	public void onMessage(Message message, Channel channel) throws Exception 
	{
		System.out.println("Received < " +message + " >");
		byte[] byteArray=message.getBody();
		CustMgmt cust1=(CustMgmt) getObject(byteArray);
		System.out.println("Customer Information is: "+cust1);
		custSer.addCustomer(cust1);
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		
	}

	private static Object getObject(byte[] byteArray) throws IOException,ClassNotFoundException
	{
		ByteArrayInputStream bis=new ByteArrayInputStream(byteArray);
		ObjectInput in=new ObjectInputStream(bis); 
		return in.readObject();
	}
}