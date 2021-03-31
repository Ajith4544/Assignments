import java.util.HashMap;
import java.util.Map.Entry;

public class l7
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(1, "ajith");
		hs.put(2, "kumar");
		hs.put(3, "jalle");
		
		
		System.out.println("The elements in the hashmap are:");
		System.out.println(hs);

		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m);
		}
		System.out.println(sb);
		
	}

}

