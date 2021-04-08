import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public classass5
{
	public static void main(String[] args) 
	{
		List<Fruit> fruitList = Arrays.asList(
				new Fruit("Pomogranate",100,90,"Red"),
				new Fruit("Apple", 52, 70, "Red"),
				new Fruit("Mango", 60, 50, "Yellow"),
				new Fruit("Banana", 89, 30, "Yellow"),
				new Fruit("Avacado",322,100,"Green"));
		
		fruitList.stream()
			.filter(f->f.getCalories()<100)
			.sorted(Comparator.comparing(Fruit::getCalories).reversed())
			.forEach(System.out::println);
		
		Map<String, List<Fruit>> grpByColor=
		fruitList.stream()
			.collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(grpByColor);
		
		
fruitList.stream()
			.filter(p->p.getColor().equalsIgnoreCase("red"))
			.sorted(Comparator.comparing(Fruit::getPrice))
			.forEach(System.out::println);
		List<String> li1=new ArrayList<>();
		li1.add("Good");
		li1.add("Nice");
		li1.add("Great Research");
		List<String> li2=new ArrayList<>();
		li2.add("budget");
		List<String> li3=new ArrayList<>();
		li3.add("Good");
		li3.add("Great Work");
		
		List<String> c1=new ArrayList<>();
		c1.add("ajith");
		c1.add("kumar");
		c1.add("jalle");
		List<String> c2=new ArrayList<>();
		c2.add("aj");
		List<String> c3=new ArrayList<>();
		c3.add("jk");
		c3.add("ammu");
		
		List<News> newsList = new ArrayList<>();
		newsList.add(new News(1,"ajith",c1,li1));
		newsList.add(new News(2,"kumar",c2,li2));
		newsList.add(new News(3,"jalle",c3,li3));
		
				
		Optional<Object> mostCommonID = newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        System.out.println(mostCommonID);
		
		long x=newsList.stream()
				.flatMap(p->p.getComment().stream())
				.filter(p->p.equalsIgnoreCase("budget"))
				.count();
		System.out.println(x);
		
		
		Integer newsId=newsList.stream()
				.collect(Collectors.groupingBy((News n)->n.getNewsId(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(newsId); 
		
		Map<List<String>, Long> comm=newsList.stream()
								.collect(Collectors.groupingBy((News n)->n.getCommentByUser(),Collectors.counting()));
		System.out.println(comm); 
		
		List<Trader> t1=new ArrayList<>();
		t1.add(new Trader("Padmini","Indore"));
		t1.add(new Trader("Jyothi","Pune"));
		t1.add(new Trader("Mani","Pune"));
		
		List<Trader> t2=new ArrayList<>();
		t2.add(new Trader("Anika","Vzm"));
		t2.add(new Trader("Shiv","Delhi"));
		t2.add(new Trader("Meera","Vizag"));
		
		List<Trader> t3=new ArrayList<>();
		t3.add(new Trader("Gauri","Pune"));
		t3.add(new Trader("Madhu","Banglore"));
		
		List<Transaction> trans= new ArrayList<>();
		trans.add(new Transaction(t1,2011,95000));
		trans.add(new Transaction(t2,2003,23460));
		trans.add(new Transaction(t3,2011,59800));
		
		trans.stream()
			.filter(p->p.getYear()>2010 && p.getYear()<2012)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(System.out::println);
		
		trans.stream()
				.flatMap(p->p.getTrader().stream())
				.filter(distinctByKey(p->p.getCity()))
				.forEach(c->System.out.println(c.getCity())) ;
		
		trans.stream()
				.flatMap(a->a.getTrader().stream())
				.filter(p->p.getCity().equalsIgnoreCase("pune"))
				.sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);
		
		trans.stream()
			.flatMap(p->p.getTrader().stream())
			.filter(distinctByKey(p->p.getName()))
			.sorted(Comparator.comparing(Trader::getName))
			.forEach(System.out::println);
		
		trans.stream()
			.flatMap(a->a.getTrader().stream())
			.filter(p->p.getCity().equalsIgnoreCase("indore"))
			.forEach(System.out::println);
		
		trans.stream()
			.flatMap(a->a.getTrader().stream())
			.filter(p->p.getCity().equalsIgnoreCase("delhi"))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		Transaction maxValue=trans.stream()
				.max(Comparator.comparing(Transaction::getValue))
				.get();
		System.out.println(maxValue);
		
		Transaction minValue=trans.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.get();
		System.out.println(minValue);
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	{
	    Map<Object, Boolean> map = new ConcurrentHashMap<>();
	    return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}

