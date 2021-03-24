import java.util.Scanner;
class tax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter salary ");
double salary=sc.nextDouble();
double tax=0.0;

if((salary<180000)&&(salary>0)){
System.out.println("you are tax free you has to pay 0 rupeess as your tax");
}
else if((salary>181001)&&(salary<300000))
 {tax=(0.1)*salary;
System.out.println(" you has to pay "+tax+ "rupeess as your tax");
}
else if((salary>300001)&&(salary<500000))
 {tax=0.2*salary;
System.out.println(" you has to pay "+tax+ "rupeess as your tax");
}

else if((salary>500001)&&(salary<1000000))
 {tax=0.3*salary;
System.out.println(" you has to pay "+tax+ "rupeess as your tax");
}

else 
System.out.println("visit office");

}
}