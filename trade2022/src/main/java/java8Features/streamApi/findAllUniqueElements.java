package java8Features.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findAllUniqueElements {

	public static void main(String[] args) {
		// If we are using map then we will get different stream for words
		String[] words = { "Hello", "World" };
		Stream<String> stream = Arrays.asList(words).stream();
		/*
		 * List<String[]>
		 * result=stream.map((s)->s.split("")).distinct().collect(Collectors.toList());
		 * result.forEach(arr->{ for(String s:arr) { System.out.print(s); } });
		 */

		List<String> uniqueCharacters = stream.map((s) -> s.split("")).flatMap(arr -> Arrays.stream(arr)).distinct()
				.collect(Collectors.toList());
		System.out.println(uniqueCharacters);
	}

}
