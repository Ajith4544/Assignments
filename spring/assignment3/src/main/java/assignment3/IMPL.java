package assignment3;


public class IMPL implements Repository {

	private double accountBalance; 
	public double getBalance(long accountId) {
		if(accountId==1111)
		{
			return accountBalance;
		}
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		if(accountId==1111)
		{
			double update = accountBalance + newBalance;
			accountBalance=update;
			return update;
		}
	return 0;
	}
}