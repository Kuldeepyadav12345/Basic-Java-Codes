package java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOperationsUsingStream {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 5, 9, 6);
		squareAllNumbersInList(num);
		sumOfAllNoInArrayList(num);
	}

	private static void sumOfAllNoInArrayList(List<Integer> num) {
		int sum=num.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum of all elements in array list is= "+ sum);
	}

	private static void squareAllNumbersInList(List<Integer> num) {
		List<Integer> square = num.stream().map((n) -> n * n).collect(Collectors.toList());
		System.out.println(square);
	}
}
