
import java.io.*;
import java.util.*;
  
class arraylist{
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<String>();
  
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
 int n=al.size(); 
        
        ListIterator iterator = al.listIterator(n);
 
        
      
//  while (iterator.hasNext())
  //        System.out.print(iterator.next() + " ");
  //System.out.println( " ");


        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");
  
  
      
    }
}