package javaFuctional;

import java.util.Comparator;
import java.util.List;

public class FPNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(4,5,6,8,12,15,18);
		numbers.stream().
		        forEach(System.out::println);
		
		System.out.println("Sum : " + numbers.stream().reduce(1,(n1,n2) -> n1*n2));
		System.out.println("=======================================");
		
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));
		System.out.println("=======================================");
		
		List<String> str = List.of("erea","basdf","dfdsf","afdfd");
		str.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));
		System.out.println("=======================================");
		
		str.stream().sorted().forEach(p -> System.out.println(p));
		
		System.out.println(2/7.0);
		
		//str.stream().f
		


	}

}
