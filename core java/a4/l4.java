import java.util.ArrayList;
import java.util.List;

public class l4 
{
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<>();
		li.add("Ajith");
		li.add("kumar");
		
		
		
		li.removeIf(a->(a.length()%2 !=0));
		
		System.out.println("Elements in the list with odd lengths are:");
		
		for (String string : li) {
			System.out.println(string);
		}
	}
}

