import java.util.Scanner;
public class bank{
public static void main(String args[])
{
int s,c,tot;
bank a=new savacc();
bank b=new curacc();
s=((savacc)a).amount();
c=((curacc)b).amount();
tot=s+c;
System.out.println("total cash "+tot);
}}

class savacc extends bank
{
int amount(){
Scanner sc=new Scanner(System.in);
System.out.println("enter fd amount");
int fd=sc.nextInt();
return fd;
}}
class curacc extends bank
{
int amount(){
System.out.println("enter cash credit");
Scanner sc=new Scanner(System.in);
int cash=sc.nextInt();
return cash;
}}