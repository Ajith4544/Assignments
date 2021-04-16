
package rest;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer9 
{
	@Id
	private int custId;
	private String custName;
	
	public int getEmpId() {
		return custId;
	}
	public void setEmpId(int custId) {
		this.custId = custId;
	}
	public String getEmpName() {
		return custName;
	}
	public void setEmpName(String custName) {
		this.custName = custName;
	}
}

