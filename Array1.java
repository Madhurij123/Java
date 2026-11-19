import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array1 {

	public static void main1(String[] args) {
	
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		Stream<Integer> strm = Arrays.stream(arr);
		
		strm
		.forEach(e -> System.out.println(e));

	}
	
	public static void main2(String[] args) {
		
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		Stream<Integer> strm = Arrays.stream(arr);
		
		strm
		.skip(2)    //skip()
		.limit(5)   //limit()
		.forEach(e -> System.out.println(e));

	}
      public static void main3(String[] args) {
		
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		Stream<Integer> strm = Arrays.stream(arr);
		
		 long cnt = strm
		 .count();
		 System.out.println("Count:"+cnt);

	}
      public static void main4(String[] args) {
  		
  		Stream<Integer> strm = Stream.iterate(1, i -> i + 1).limit(10);
  		int num = 5;
  		
  		strm
  		.map(n -> n * num)
  		.forEach(e -> System.out.println(e));
  	}
      public static void main6(String[] args)
      {
    	  String[] arr = {"Smita", "Smita", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
    	  
    	  Stream<String> strm = Arrays.stream(arr);
    	  
    	  strm
    	  //.map(word -> word.toUpperCase())
    	  //.distinct()
    	  .filter(i -> i.endsWith("a"))
    	  .forEach(e -> System.out.println(e));
    	  
      }
      public static void main(String[] args)
      {
    	  IntStream strm = IntStream.of(10,20,30,40,50,60,70,80,90);
    	  
    	  //strm
    	  //.map( n -> n * n)
    	  //.forEach(e -> System.out.println(e));
    	  
    	  IntStream strm1 = IntStream.of(10,20,30,40,50,60,70,80,90);
          
    	  //IntSummaryStatistics stats = strm1.summaryStatistics();
    	  //System.out.println("States:"+stats.toString());
    	  
    	  IntStream strm2 = IntStream.of(10,20,30,40,50,60,70,80,90);
    	  OptionalInt strm3 = strm2.min();
    	  System.out.println("States:"+strm3.toString());

    	  
      }

}
