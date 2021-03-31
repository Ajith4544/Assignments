import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class l5 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		Consumer<String> letter=(s)->
		{
			sb.append(s.charAt(0)); 
		};
		List<String> li=new ArrayList<>();
		li.add("ajith");
		li.add("kumar");
		li.add("jalle");
		for (Iterator iterator = li.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
			letter.accept(string);
			
		}
		System.out.println(sb);
	}
}