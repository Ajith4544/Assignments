import java.io.*;
import java.util.*;
  
class array {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
   al.add(1);
      al.add(2);
  al.add(3);
	al.add(4);
	al.add(5);
        
       
        ListIterator it = al.listIterator(al.size());
      
        while (it.hasPrevious())
            System.out.print(it.previous() + " ");
         System.out.println();
        
    }
}