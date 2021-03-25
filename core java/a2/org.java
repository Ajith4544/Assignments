import java.util.Scanner;
 class employee{

int salary=50000;


}
class manager extends employee{
int inc=0;
Scanner sc=new Scanner(System.in);
public void setIncentive(int inc){
Scanner sc=new Scanner(System.in);
//System.out.println("enter number of incentives");
//int inc=sc.nextInt();
int sal=inc+super.salary;
System.out.println("base  salary="+salary);
System.out.println(+sal);
}
}
class labour extends employee{
int OT=0;
public void setOT(int OT){
Scanner sc=new Scanner(System.in);
//System.out.println("enter number of overtimes done");
//int ot=sc.nextInt();
int sal=OT*100+super.salary;
System.out.println("base  salary="+salary);
System.out.println(+sal);
}}

public class org {
public static void main(String args[]){
manager m =new manager();
labour l=new labour();
m.setIncentive(1000);
l.setOT(3);
}}