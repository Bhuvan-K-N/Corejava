package com.tnsif.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> ob = Stream.of(10,20,30,40,50);
//		System.out.println(ob);
//		ob.forEach(System.out::println);
		
		Integer[] elem= new Integer[] {2,3,4,5};
		ob=Arrays.stream(elem);
		ob.forEach(System.out::println);
		
	    Integer[] values = new Integer[] {1,2,3,4,5};
	    Stream<Integer> Stream= Arrays.stream(values);
	    
	    // map function
	    System.out.println("Sqauare of a no"+Arrays.toString(values));
	    Stream.map(num->num*num).forEach(System.out::println);
	    
	    System.out.println("even no");
	    Integer[] value = new Integer[] {1,2,3,4,5};
	    Stream<Integer> Streams= Arrays.stream(value);
	    
	    Streams.filter(ele->ele%2==0).forEach(System.out::println);
	    
	    System.out.println("limit operation");
	    Integer[] valu = new Integer[] {1,2,3,4,5};
	    Stream<Integer> Streamsobj= Arrays.stream(valu);
	    
	    System.out.println("skip 1st 2 elements");
	    Arrays.stream(valu).skip(2).forEach(System.out::println);
	    
	    
	
	}

}
       