package assignment3;


public class Controller {
	private double accountBalance;
	public double withdraw(long accountId, double balance) {
		if(accountId==1111)
		{
			double update=accountBalance-balance;
			accountBalance=update;
			return update;
		}
		return 0;
	}

	public double deposit(long accountId, double balance) {
		if(accountId==1111)
		{
			double update=accountBalance+balance;
			accountBalance=update;
			return update;
		}
		return 0;
	}

	public double getBalance(long accountId) {
		if(accountId==1111)
		{
			return accountBalance;
		}
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(fromAccount==1111 && amount<accountBalance)
		{
			return true;
		}
		return false;
	}
}

