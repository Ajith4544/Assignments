

import java.util.HashSet;

public class bank 
{

	public static void main(String[] args)
	{
		HashSet<SavingsAccCollections> s = new HashSet<SavingsAccCollections>();
		SavingsAccCollections a1=new SavingsAccCollections(1234.0, 1111, "A","yes");
		SavingsAccCollections a2=new SavingsAccCollections(1542.0, 2222, "B","no");
		SavingsAccCollections a3=new SavingsAccCollections(2514.0, 3333, "C","yes");
		a3.updateBalance("deposit",1000);
		s.add(a1);
		s.add(a2);
		s.add(a3);
		for(SavingsAccCollections sac:s)
		{
			System.out.println("Account id: " + sac.acc_id +" Account Holder Name: "+sac.accHolderName+ " Balance: "+ sac.acc_balance);
		}
		
	}
}

 class SavingsAccCollections 
{
	Double acc_balance;
	int acc_id;
	String accHolderName;
	String isSalaryAccount;
	
	public SavingsAccCollections(Double acc_balance, int acc_id, String accHolderName, String isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accHolderName = accHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public Double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(Double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(String isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void updateBalance(String  up,int amt)
	{
		if(up=="withdraw")
		{
			acc_balance=acc_balance-amt;
		}
		else if(up=="deposit")
		{
			acc_balance=acc_balance+amt;
		}
	}
}


