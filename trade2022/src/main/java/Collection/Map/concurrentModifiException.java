package Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class concurrentModifiException {

	public static void main(String[] args) {
		//For Map
	/*Map<String,String> m=new HashMap<String, String>();
	m.put("a", "A");
	m.put("b", "B");
	m.put("c", "C");
	m.put("d", "D");
	Iterator i=m.keySet().iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		m.put("e","E");
	}*/
		
		//For ArrayList of Integers
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			a.add(55);
		}
	}

}
