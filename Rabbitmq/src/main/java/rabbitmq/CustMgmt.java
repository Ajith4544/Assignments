
package rabbitmq;

import java.io.Serializable;

public class CustMgmt implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public CustMgmt() {
		super();
	}

	public CustMgmt(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerMgmt [id=" + id + ", name=" + name + "]";
	}
}