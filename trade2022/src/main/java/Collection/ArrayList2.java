package Collection;
import java.util.*;
public class ArrayList2 {
// demonstrate get and set method in Arraylist
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Mango");
		a.add("Banana");
		a.add("Papaya");
		a.add("Orange");
		System.out.println("Using get Method---->  "+a.get(1));
		a.set(1, "WaterMellon");
		for(String str:a)
		{
			System.out.println(str);
		}
	}

}
