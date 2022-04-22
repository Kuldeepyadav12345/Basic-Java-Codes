package java8Features.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ReverseASstringUsingLambda {

	public static void main(String[] args) {
		Consumer<String> c = (e) -> {
			/*
			 * //Reverse a String Using String Buffer StringBuffer str = new
			 * StringBuffer(e); System.out.println(str.reverse());
			 */

			System.out.println("");
			// Reverse a string Using for loop
			String rev = "";
			for (int i = e.length() - 1; i >= 0; i--) {
				rev = rev + e.charAt(i);
			}
			System.out.println(rev);
		};
		c.accept("Hello");
	}

}
