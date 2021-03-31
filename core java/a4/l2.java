interface Order
{
	void res(int price,String status);
}
public class l2 
{
	public static void main(String[] args)
	{
		Order MO=(price,status)->{
			if(price>=10000) {
				if(status=="ACCEPTED" || status=="COMPLETED")
				{
					System.out.println("Order Printed     "+status);
				}
			}
			else
			{
				System.out.println("Order is not printed   "+status);
			}
		};
		MO.res(20000, "COMPLETED");
		MO.res(1000, "COMPLETED");
		MO.res(500, "ACCEPTED");
		MO.res(10000, "ACCEPTED");

	}

}
