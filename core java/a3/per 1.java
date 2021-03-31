import java.util.*;
class person implements Comparable<person>
{
int h,w;
String name;
public person(int h,int w,String name){
super();
this.h=h;
this.w=w;
this.name=name;
}
@Override
public int compareTo(person p){
if(w<p.w)
{
return -1;
}
else if(w>p.w)
{
return 1;
}
else
{
if(h>p.h)
{
return 1;
}
else if(h<p.h)
{
return -1;
}
else
{
return 1;
}
}}}

public class per{
public static void main(String args[]){
Set<person> set=new TreeSet<person>();
person a=new person(20,15,"ajith");
person b=new person(10,15,"kumar");
person c=new person(30,18,"jalle");

set.add(a);
set.add(b);
set.add(c);

for(person p:set)
{
System.out.println(p.name);
}}}


