import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hst extends Thread
{

	static CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
	public void run()
	{
		list.add("a");
	}
	public static void main(String[] args) throws InterruptedException
	{
		list.add("a");
		list.add("b");
		list.add("c");
		CopyOnWriteArrayListEx cp=new CopyOnWriteArrayListEx();
		cp.run();
		Thread.sleep(10000);
		Iterator iter =list.iterator();
		while(iter.hasNext())
		{
			String s=(String)iter.next();
			System.out.println(s);
			Thread.sleep(10000);
		}
		System.out.println(list);
	}

}




public class hsm 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> hs=new HashMap<>();
		hs.put("1-11-1111","a");
		hs.put("2-22-2222","b");
		hs.put("3-33-3333","c");
		hs.put("4-44-4444","d");
		
		System.out.println("Printing HashMap:");
		Iterator iter = hs.keySet().iterator();
		while(iter.hasNext())
		{
			System.out.println(hs.get(iter.next()));
			hs.put("14-04-20004", "abc");
		}
		
	}
}