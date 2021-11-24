package Collection;
import java.util.*;

public class CollectionsSort {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("hello");
	a.add("nice");
	a.add("how are you");
	a.add("fine");
	System.out.println();
	CollectionsSort o=new CollectionsSort();
	System.out.println(a);
	Collections.sort(a);
			System.out.println(a);
}
}
