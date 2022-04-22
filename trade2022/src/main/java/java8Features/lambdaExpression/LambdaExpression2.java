package java8Features.lambdaExpression;
import java.util.function.*;
@FunctionalInterface
interface scale
{
abstract void expression();
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		scale s=()->System.out.println("Lambda With no paramater");
	}
}
