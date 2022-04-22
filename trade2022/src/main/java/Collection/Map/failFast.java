package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import oracle.net.aso.e;
//Fail fast example 
public class failFast {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "A");
		m.put("b", "B");
		m.put("c", "C");
		m.put("d", "D");
		Iterator<String> i = m.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			m.put("E", "e");
		}

	}
}
