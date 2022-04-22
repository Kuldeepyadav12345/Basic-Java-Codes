package Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurCount {
	public static void main(String[] args) {
		String s="SssSBBDDCC";
		s=s.toLowerCase();
		System.out.println(s);
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<s.length()-1;i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				int count=h.get(s.charAt(i))+1;
				h.put(s.charAt(i), count);
			}
			else
			{
				h.put(s.charAt(i), 1);
			}
		}
		System.out.println(h);
		 int maxValueInMap = (Collections.max(h.values()));
		List<Map.Entry<Character, Integer>> l=new ArrayList<>(h.entrySet());
		System.out.println(l);
		
}
}




