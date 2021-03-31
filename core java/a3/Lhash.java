import java.util.*;
//	import java.util.Iterator;  
import java.util.LinkedHashSet;  
public class Lhash{
public static void main(String args[])
{
LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
lhs.add(33);
lhs.add(25);
lhs.add(45);
lhs.add(5);
lhs.add(51);
lhs.add(6);
lhs.add(7);
Iterator<Integer> i=lhs.iterator();    
                   while(i.hasNext())    
                   {    
                   System.out.println(i.next());     
                   }    
     }    
    }   