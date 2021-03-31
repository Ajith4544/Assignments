import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class l3
{
		public static void main(String[] args) {
			
			Supplier<Double> randomValue = ()->Math.random();
			Predicate<Integer> greaterThan = i->(i>50);
			Consumer<String> display = (i)->System.out.println(i);
			Function<Integer,Double> half =(a)->a*0.5;
			
			
			System.out.println("Predicate");
			System.out.println(greaterThan.test(90));
			

			System.out.println("Supplier ");
			System.out.println(randomValue.get());

			System.out.println("Consumer ");
			display.accept("hello");

			System.out.println("Function ");
			System.out.println(half.apply(250));
		}
	}
