package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	List<String> l2=new ArrayList<String>();
	l1.add("Abhishek");
	l1.add("Abdul");
	l2.add("Cherry");
	l2.add("Dragon");
	l2.add("Eleph");
	l1.add("Kuldeep");
	l1.add("Krishav");
	l1.add("Krishna");
	l1.addAll(l2);
	Collections.sort(l1);
	System.out.println(l1);
	for (Iterator iterator = l1.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		if(string.startsWith("K"))
		{
			System.out.println(string);
		}
	}
	}
}
