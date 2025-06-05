package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(60,2,3,4,5,6); //l=[60,2,3,4,5,6]
		System.out.println(l);
		
		
		// map:   add 10 to each and every element in the list
		
		List<Integer> result = l.stream().map(x-> x+10).collect(Collectors.toList());
		System.out.println(result);
		
	
		//element: greater than 6
		
		List<Integer> result1 = l.stream().filter(x-> x>6).collect(Collectors.toList());
		System.out.println(result1);
		
		
		//sorted
		
		List<Integer> result2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
		
		
		List<Integer> d = l.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(d);
		
		//even numbers : print
		
		
		int addition=l.stream().filter(x-> x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(addition);
		
		int add = l.stream().sorted().reduce(0, (a,b)->(a+b));
		System.out.println(add);
				}

}
