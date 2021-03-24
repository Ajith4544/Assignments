import java.util.Scanner;
class tax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter salary ");
double salary=sc.nextDouble();
double tax=0.0;
if((salary>181001)&&(salary>300000))
 {tax=(0.1)*salary;
System.out.println(" you has to pay "+tax+ "rupeess as your tax");
}}}