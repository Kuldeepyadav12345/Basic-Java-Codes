package Collection;
import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(1);
		l.add(2);
		Collections.sort(l);
		System.out.println(l);
		//Output should be 3,5 asked in queenstreet company First sorted the list using 
		// collections.sort method and then if first and second element is same then removed them
		for (int i = 0; i < l.size()-1; i++) {
			if(l.get(i).equals(l.get(i+1)))
			{
				l.remove(i);
				l.remove(i);
				i--;
			}
		}
		System.out.println(l);

	}

}
