package java8Features.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cunsumerInterfaceInLambdaExpression {

	public static void main(String[] args) {

		Consumer<String> c = (e) -> {
			System.out.println(e);
		};
		c.accept("Hello");

		// Predicate will accept an integer and returns a boolean output
		Predicate<Integer> p = (e) -> e % 2 == 0;
		System.out.println(p.test(24));
		System.out.println(p.test(23));

		Supplier<String> s = () -> {
			return "Bye";
		};
		System.out.println(s.get());
	}

}
