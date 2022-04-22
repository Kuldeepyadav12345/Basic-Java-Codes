package Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class forEachLoopInArrayList {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Alex","James","Sam","Rick");
		/*
		 * for(String string:names) { System.out.println(string); }
		 */

		
		//USing lambda expression ie lambda expession as an argumant
		names.forEach((e)->System.out.println(e));
	}

}
