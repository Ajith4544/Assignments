import java.util.Scanner;  
import java.lang.Math;
class Armstrong
{  
  public static void main(String[] args)  
  {  
    int c=0,a,temp;  
 // int n=153;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number: ");  
        int n = sc.nextInt();  
	sc.close();  
       
 temp=n;  
        while(n>0)  
  	  {  
  	  a=n%10;  
  	  n=n/10;  
 	  c=c+(a*a*a);  
    	  }  
    if(temp==c)  
{
System.out.print(+temp);    
System.out.println( "  is armstrong number");   
 }
   else
{
       System.out.print("" +temp+"is not armstron number ");  
 //System.out.println( " is Not armstrong number");   
   }  
}  

}

