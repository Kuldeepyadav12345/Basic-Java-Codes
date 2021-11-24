package Collection;
import java.util.*;
public class ArrayListt {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(30);
		a.add(20);
		System.out.println(a);
		for (int i = 0; i < a.size(); i++) {
			Integer value=a.get(i);
			if(value.equals(30))
			{
				a.remove(i);
				i--;
			}
		}
		System.out.println(a);
		//HashSet<Integer> h=new HashSet<Integer>(a);
		//System.out.println(h);
				

	}

}
