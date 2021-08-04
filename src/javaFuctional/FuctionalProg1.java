package javaFuctional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FuctionalProg1 {
	public static void main (String[] args) {
		List<String> list1=List.of("Apple","Banana","Orange","Kiwi");
		
		Map<Integer,String> m1=Map.of(1,"one",2,"two",3,"three",4,"four",5,"five",6,"six",8,"eight",9,"nine",10,"ten",11,"eleven");

		m1.entrySet().stream().forEach(k -> System.out.println(k+ " --- " + k.getValue()));
		m1.keySet().stream().sorted().collect(Collectors.toList()).forEach(p -> System.out.println(p));
		
		System.out.println("=======================================");
		
        printBasic(list1);
		System.out.println("=======================================");
		System.out.println("=======================================");
		
		printwithFP(list1);
		System.out.println("=======================================");
		printwithFPwithFilter(list1);
		
	}
	
	private static void printBasic(List<String> list1) {
		for(String list: list1) {
			System.out.println(list);
		}
		
	}
	
	private static void printwithFP(List<String> list1) {
		list1.stream().forEach(l -> System.out.println("element - "+l));
	}

	private static void printwithFPwithFilter(List<String> list1) {
		list1.stream()
			 .filter(l -> l.endsWith("e"))
			 .forEach(l -> System.out.println("element - "+l));
	}
}
