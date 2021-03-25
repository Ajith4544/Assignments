import java.util.*;
import java.io.*;

 abstract class desertitem{
int candy=0,cookie=0,ice=0,price=0;
abstract void getcost();
}


class owner extends desertitem{
owner(int a,int b,int c){
 candy=candy+a;
 cookie=cookie+b;
 ice=ice+c;
}
void getcost()
{
//@override


 price=(candy*20*60)+(cookie*10*70)+(ice*40*1);
System.out.println("price to be paid  "+price);
}}


class customer extends desertitem{
customer(int a,int b,int c)
{
 candy=a;
  cookie=b;
 ice=c;
}
void getcost()
{
//@ovverride
 price=(candy*20*60)+(cookie*10*70)+(ice*40*1);
System.out.println("price to be paid  "+price);
}}


public class desert
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("welcome");
System.out.println("select your role");
String role=sc.next();
if(role.equals("owner"))
{
System.out.println("enter number of candies");
int a=sc.nextInt();
System.out.println("enter number of cookies");
int b=sc.nextInt();
System.out.println("enter number of icecreams");
int c=sc.nextInt();

desertitem o=new owner(a, b, c);
o.getcost();
}

else
{

System.out.println("enter number of candies");
int a=sc.nextInt();
System.out.println("enter number of cookies");
int b=sc.nextInt();
System.out.println("enter number of icecreams");
int c=sc.nextInt();
desertitem cus=new customer(a, b, c);
cus.getcost();
}}}




