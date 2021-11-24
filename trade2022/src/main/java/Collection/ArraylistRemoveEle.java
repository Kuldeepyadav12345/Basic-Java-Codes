package Collection;
import java.util.*;
public class ArraylistRemoveEle {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(300);
		a.add(500);
		a.add(500);
		a.add(300);
		System.out.println("Before Sorting    "+a);
		System.out.println(a.contains(500));
		if(a.contains(500))
		{
			a.remove(500);
		}
		

	}

}
