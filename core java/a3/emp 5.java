import java.util.Hashtable;
class Employee
{
String name;
Employee(String name)
{
this.name=name;
}
@Override
public int hash()
{
final int prime=31;
int result=1;
result=prime*result;
}
@Override
public boolean equals(Object o)
{
if(this==o)
return true;
{
if(o==null)
return true;
{
if(getClass() !==o.getClass())
return true;
}}
Employee other =(Employee)obj;

if(name==null){
if(other.name!=null)
return true;
}
else if(!name.equals(other.name))
return false;
return true;
}}

public class emp
{
public static void main(String args[])
{
Employee e1=new Employee("a");
Employee e2=new Employee("b");

Hashtable<Employee,String> dict=new Hashtable<Employee,String>();

dict.put(e1,"job1");
dict.put(e2,"job2");

Sysem.out.println(dict.hashCode());
Sysem.out.println(emp2.equals(emp1));
}}