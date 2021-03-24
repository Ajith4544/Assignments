import java.util.Scanner;
class login
{
public static void main(String args[])
{

String name="aj";
String password="4544";
int i;
Scanner sc=new Scanner(System.in);
for(i=1;i<=3;i++)
{
Scanner s=new Scanner(System.in);
System.out.println("please give me name id : ");
String id=s.next();
System.out.println("please give me password : ");
String pass=s.next();

if((id.equals(name))&&(pass.equals(password)))
{
System.out.println("welcome   "+name);
break;
}

}
if(i>3)
System.out.println("contact admin");

}}
