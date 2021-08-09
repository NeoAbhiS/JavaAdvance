package javaFuctional;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Divisor3 {

	public static void main(String[] args) {
		
		System.out.print("Enter first number- ");
		int fn= new Scanner(System.in).nextInt(); //System.in is a standard input stream.
		
		System.out.print("Enter first number- ");
		int sn= new Scanner(System.in).nextInt(); //System.in is a standard input stream.
		
		System.out.println("The Numbers in the range [" +
		                    fn + " , " + sn +
		                    "] , which have exactly 3 divisors are : ");
		
		IntStream.rangeClosed(fn, sn)	         //Range from 1st number till 2nd number
				 .filter(Divisor3 :: divisibleBySqrt)  //Check if number is perfect square
				 .filter(x -> isPrime(x)).boxed()  //Check if number is square of Prime number
		         .forEach(System.out::println);
	
	}
	
	//Check if number is square of Prime number
	private static boolean isPrime(int n) {
		int number =  (int) Math.sqrt(n);
		if(number <= 2)
	        return number == 2;
	    else
	        return  (number % 2) != 0
	                &&
	                IntStream.rangeClosed(3, (int) Math.sqrt(number))
	                .filter(x -> x % 2 != 0)
	                .noneMatch(x -> (number % x == 0));
	}
	
	//Check if number is perfect square
	private static boolean divisibleBySqrt(int n) {
		return n % Math.sqrt(n) == 0;
		
	}

}
