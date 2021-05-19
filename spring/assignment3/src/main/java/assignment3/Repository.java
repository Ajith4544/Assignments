package assignment3;


public interface Repository 
{
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}

