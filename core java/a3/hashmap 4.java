import java.util.*;
import java.util.Map.Entry;
public class hashmap
{
public static void main(String args[])
{
HashMap<String,String> h=new HashMap<>();

h.put("1-1-1111","abc");
h.put("2-2-2222","def");

h.put("3-3-3333","ghi");
for(Entry<String,String> a:h.entrySet()){
System.out.print(a.getKey()+"  ");
System.out.println(a.getValue()+"  ");
}}}