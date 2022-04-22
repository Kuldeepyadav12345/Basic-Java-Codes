package Collection.Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class failSafe {

	public static void main(String[] args) {
		//Arraylist Example
		/*ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		CopyOnWriteArrayList<Integer> copy=new CopyOnWriteArrayList<Integer>(a);
		Iterator<Integer> i=copy.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			copy.add(5);
		}
*/
		
		//Concurent has map can also achieve fail safe
		
		ConcurrentHashMap<String , Integer> m=new ConcurrentHashMap<String, Integer>();
		m.put("one",1);
		m.put("two",2);
		m.put("three",3);
		m.put("four",4);
		Iterator i=m.keySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			m.put("five", 5);
		}
	}

}
