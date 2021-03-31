import java.util.*;
public class hash{
public static void main(String args[])
{
HashSet<Integer> hs=new HashSet<>();
hs.add(35);
hs.add(8);
hs.add(2);
hs.add(51);
hs.add(11);
hs.add(24);
hs.add(17);
System.out.println(hs);


LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
lhs.add(2);
lhs.add(8);
lhs.add(11);
lhs.add(17);
lhs.add(24);
lhs.add(35);
lhs.add(51);
System.out.println(lhs);
}}
