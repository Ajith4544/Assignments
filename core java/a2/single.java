class singleton
{
 static singleton s=new singleton();
 private singleton()
{
}
public static singleton getInstance()
{
return s;
}
public void getInfo()  {
System.out.println("singleton class");
}}

/*public class inherit extends singleton{
public void Inherit ()
{
return s;
}}*/

public class single
{
public static void main(String args[])
{
singleton ste=singleton.getInstance();
ste.getInfo();
}}