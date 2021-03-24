import java.util.Scanner;
class results
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter subject 1 marks");
int s1=sc.nextInt();
System.out.println("enter subject 2 marks");
int s2=sc.nextInt();
System.out.println("enter subject 3 marks");
int s3=sc.nextInt();
 if((s1>100)||(s2>100)||(s3>100)||(s1<0)||(s2<0)||(s3<0))
  {
  System.out.println("not valid");
  }
else
 {
 if (s1>=60)              
 {
 	if(s2>=60)
 	{
 		if(s3>=60)
	 	{
 		System.out.println("passed");
		 }
                else
                {
                System.out.println("promoted");
                }
          }
else
{
System.out.println("failed");
}}
else
{
System.out.println("failed");
}}

}}