package java8Features.lambdaExpression;

// remove odd elements from the list using lambda expression
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AcceptAnArrAndReturnSqueareOfEachElement {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 6, 5, 4);
		/*
		 * Stream<Integer> s=l.stream(); s.forEach(k-> { Function<Integer,Integer>
		 * f=i->k*k; System.out.println(f.apply(k)); });
		 */
		Stream<Integer> s=l.stream();
		s.forEach(c->
		{
		Function<Integer, Integer> f=g->c*c;
		System.out.println(f.apply(c));
		});
		
		
		
	}
}
