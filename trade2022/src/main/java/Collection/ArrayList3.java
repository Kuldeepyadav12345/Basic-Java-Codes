package Collection;
import java.util.*;

public class ArrayList3 {
//Sorting a arrayList using Collections.sort method
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		 a.add("Mango");  
		 a.add("Apple");  
		 a.add("Banana");  
		 a.add("Grapes");
		 Collections.sort(a);
		 for(String str:a)
		 {
			 System.out.println(str);
			 //Sorts the list in alphabetically order 
		 }
		 System.out.println("");
		  //Iterate it using enumeration
		  Enumeration<String> e=Collections.enumeration(a);
		  while(e.hasMoreElements())
		  {
			  System.out.println(e.nextElement());
		  }
	}

}
