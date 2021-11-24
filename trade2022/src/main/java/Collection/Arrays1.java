package Collection;

import java.util.*;

public final class Arrays1 {

	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> a = new ArrayList<Integer>(n);

		for (int i = 0; i <= n; i++) {
			a.add(i);
		}
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		for (Integer integer : a) {
			System.out.print(" " + integer + " ");
		}
	}
}
