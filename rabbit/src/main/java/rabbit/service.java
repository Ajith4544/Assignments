package rabbit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service 
{
	@Autowired
	private Repository custRepo;
	
	public List<CustMgmt> getAllCustomer()
	{
		List<CustMgmt> li=new ArrayList<CustMgmt>();
		custRepo.findAll().forEach(li::add);
		return li;
	}
	
	public void addCustomer(CustMgmt cus)
	{
		custRepo.save(cus);
	}

	@SuppressWarnings("unused")
	private void add(CustMgmt custmgmt1) {
	}
}