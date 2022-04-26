package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapp {
	/*
	 * WHat the difference between Map and flat map?
	 * 
	 * List<Integers>
	 * square=numbers.stream().map((n)->n*n).collect(Collectors.toList());
	 * 
	 * map() method => one to one mapping => Accepts one input and returns one
	 * output
	 * 
	 * 
	 * FlatMap() method => ont to many mapping (it flattens a stream ) => Accepts
	 * input and returns zero to many outputs
	 */

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> square=numbers.stream().map((n)->n*n).collect(Collectors.toList());
//		System.out.println(square);
		
		
		List<List<Integer>> numbers =new ArrayList<List<Integer>>();
		numbers.add(Arrays.asList(22,44));
		numbers.add(Arrays.asList(2,85));
		numbers.add(Arrays.asList(33,45));
		numbers.add(Arrays.asList(55,89));
		numbers.add(Arrays.asList(78,88));
		numbers.add(Arrays.asList(68,66));
		numbers.stream().map(list->list.toString()).forEach((e)->System.out.println(e));
		
		
		
	}

}
