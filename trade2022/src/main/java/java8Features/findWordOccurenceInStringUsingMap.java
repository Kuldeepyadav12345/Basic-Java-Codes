package java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class findWordOccurenceInStringUsingMap {
	public static void main(String[] args) {
		String str = "I love my India India is my country";
		findOccurence(str);
	}

	public static void findOccurence(String s) {
		String[] words = s.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (m.containsKey(words[i])) {
				int value = m.get(words[i]);
				m.put(words[i], value + 1);
			} else {
				m.put(words[i], 1);
			}
		}
		System.out.println(m);
	}
}