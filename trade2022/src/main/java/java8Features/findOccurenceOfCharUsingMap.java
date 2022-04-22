package java8Features;

import java.util.HashMap;
import java.util.Map;

public class findOccurenceOfCharUsingMap {

	public static void main(String[] args) {
		String s = "Hello World";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		s = s.replaceAll(" ", "").toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {
			if (m.containsKey(s.charAt(i))) {
				int val = m.get(s.charAt(i)) + 1;
				m.put(s.charAt(i), val);
			} else {
				m.put(s.charAt(i), 1);
			}
		}
		System.out.println(m);
	}

}
