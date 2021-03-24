import java.util.Scanner;
class results
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter student1  marks in a  ");
int a1=sc.nextInt();
System.out.print("enter student1 marks in b  ");
int b1=sc.nextInt();
System.out.print("enter student1 marks in c  ");
int c1=sc.nextInt();
int total1=a1+b1+c1;
double avg1=total1/3;
System.out.println("the total marks of student1 ="+total1);
System.out.println("the average of student1 is "+avg1);
System.out.println(" ");


System.out.print("enter student2  marks in a   ");
int a2=sc.nextInt();
System.out.print("enter student2 marks in b  ");
int b2=sc.nextInt();
System.out.print("enter student2 marks in c  ");
int c2=sc.nextInt();
int total2=a2+b2+c2;
double avg2=total2/3;
System.out.println("the total marks of student2 ="+total2);
System.out.println("the average of student2 is "+avg2);
System.out.println(" ");



System.out.print("enter student3 marks in a  ");
int a3=sc.nextInt();
System.out.print("enter student3 marks in b  ");
int b3=sc.nextInt();
System.out.print("enter student3 marks in c  ");
int c3=sc.nextInt();
int total3=a3+b3+c3;
double avg3=total3/3;
System.out.println("the total marks of student3 ="+total3);
System.out.println("the average of student 3 is "+avg3);
System.out.println(" ");
double avgofa =(a1+a2+a3)/3;
double avgofb =(b1+b2+b3)/3;
double avgofc =(c1+c2+c3)/3;

System.out.println("average of   subject a is "+avgofa);
System.out.println("average of   subject  b is "+avgofb);
System.out.println("average of   subject c is "+avgofc);
}}