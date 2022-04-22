package Collection.Map;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		String s="SSFFDGFGGGG";
		HashMap<Character, Integer> h=new HashMap<>();
		for(int i=0;i<s.length()-1;i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				int count=h.get(s.charAt(i));
				h.put(s.charAt(i), ++count);
			}
			else
			{
				h.put(s.charAt(i), 1);
				
			}
		}
		System.out.println(h);

	}

}
