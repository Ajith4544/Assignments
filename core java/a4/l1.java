
@FunctionalInterface
interface Add
{
	int a(int a,int b);
}
interface Sub
{
	int s(int a,int b);
}
interface Mul
{
	int m(int a,int b);
}
interface Div
{
	int d(int a,int b);
}
public class l1 
{
	public static void main(String[] args)
	{
		System.out.println("Addition:");
		Add MyAdd=(a,b)->(a+b);
		System.out.println(MyAdd.a(10,5));
		
		System.out.println("Subtraction:");
		Sub MySub=(a,b)->(a-b);
		System.out.println(MySub.s(10,5));
		
		System.out.println("Multiplication:");
		Mul MyMul=(a,b)->(a*b);
		System.out.println(MyMul.m(10, 5));
		
		System.out.println("Division:");
		Div MyDiv=(a,b)->(a/b);
		System.out.println(MyDiv.d(10,5));
	}
	
}