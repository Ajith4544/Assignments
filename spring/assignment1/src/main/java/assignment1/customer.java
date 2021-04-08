package assignment1;


	//import java.util.List;

	public class customer {

		private int customerId;
		private String customerName;
		private int customerContact;
		private address customerAddress;
		
		public void Customer(int customerId, String customerName, int customerContact, address customerAddress) {
	
		//	super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerContact = customerContact;
			this.customerAddress = customerAddress;
		}
		
		public int getCustomerId() {
			return customerId;
		}

		
		  public void setCustomerId(int customerId) { this.customerId = customerId; }
		 
		public String getCustomerName() {
			return customerName;
		}

		
		  public void setCustomerName(String customerName) { this.customerName =
		  customerName; }
		 
		public int getCustomerContact() {
			return customerContact;
		}

		
		 public void setCustomerContact(int customerContact) { this.customerContact =
		  customerContact; }
		 
		public address getCustomerAddress() {
			return customerAddress;
		}

		
		  public void setCustomerAddress(address customerAddress) {
		  this.customerAddress = customerAddress; }
		 
		public void printDetails() {
			System.out.println("Customer Id: "+customerId+", Customer Name: "+customerName+", Customer Contact: "+customerContact);
			System.out.println("Street: "+customerAddress.getStreet());
			System.out.println( "City:" +customerAddress.getCity());
			System.out.println( "State: "+customerAddress.getState());
			System.out.println("Zip: "+customerAddress.getZip());
			System.out.println( " Country: "+customerAddress.getCountry());
		}
		
	}
