
package rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service9 
{
	@Autowired
	private CustomerRepository custRepo;
	
	public List<Customer> getAllCustomer()
	{
		List<Customer> li=new ArrayList<Customer>();
		custRepo.findAll().forEach(li::add);
		return li;
	}
	
	public Customer getCustomer(int id)
	{
		return custRepo.findById(id).get();
	}
	
	public void addCustomer(Customer cus)
	{
		custRepo.save(cus);
	}
	
	public void updateCustomer(int id,Customer cus)
	{
		custRepo.save(cus);
	}
	public void deleteCustomer(int id)
	{
		custRepo.deleteById(id);
	}
}
