package java8Features.lambdaExpression;

import java.util.function.Consumer;

public class ReverseAllCharacterInsideStringUsingLambda {

	public static void main(String[] args) {
		Consumer<String> c = (e) -> {
			/*// Reversed all the character of string using StringBuffer Inbuilt Function 
			 * System.out.println("Original String = " + e); System.out.println(""); char[]
			 * rev = e.toCharArray(); StringBuffer str = new StringBuffer(e);
			 * System.out.println("Reversed String = " + str.reverse());
			 */
			for (int i = e.length()-1; i >=0; i--) {
				System.out.print(e.charAt(i));
			}
			
			
			
		};
		c.accept("How Are You");

	}

}
