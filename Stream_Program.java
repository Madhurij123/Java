import java.util.stream.Stream;

public class Stream_Program {

	public static void main1(String[] args)
	{
		//Input : 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 
		//step1 : Square of each number : 1 , 4 , 9 , 16 , 25 , 36 , 49 , 64 , 81 , 100 
		//step2 : get all odd numbers : 1 , 9 , 25 , 49 , 81 
		//step3 : append "java" :  "java1" , "java9" , "java25" , "java49" , "java81"
		// print each element 
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.map( n -> n * n)
		.filter(n -> n%2!=0)
		.map(n -> "java"+n)
		.forEach(e -> System.out.println(e));
	}
	
	public static void main2(String[] args)
	{
		Stream<Integer> strm = Stream.of(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> strm1 = strm.map(n -> n * n);
		
		Stream<Integer> strm2 = strm1.filter( n -> n%2!=0);
		
		Stream<Object> strm3 = strm2.map(n -> "java"+n);
		
		strm3.forEach(e -> System.out.println(e));
	}
	
	public static void main(String[] args)
	{
		Stream.of(1,2,3,4,5,6,7,8,9)
		.map(n -> {
			System.out.println("map----------"+n);
			return n * n;
		})
		.filter(n -> {
			System.out.println("filter--------"+n);
			return n%2!=0;
		})
		.sorted((x,y) ->{
			System.out.println("Sort:"+ x + "<>" +y);
			return x - y;
		})
		.map(n -> {
			System.out.println("map------------"+n);
			return "java"+n;
		})
		//Without Terminal Operations(ForEach) cannot excute Stream methods
		.forEach(e ->{
			System.out.println("For Each:"+e);
		});
		System.out.println("Byeee...!!");
	}
}
