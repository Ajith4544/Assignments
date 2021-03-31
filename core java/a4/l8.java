import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public classl8
{
	public static void main(String[] args)
	{
		Consumer<Integer> display = (i)->System.out.println(i);
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
			display.accept(integer);
		}
		Thread lambdaThread=new Thread();
		lambdaThread.run();	
	}
}