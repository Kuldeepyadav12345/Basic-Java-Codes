package java8Features.lambdaExpression;

@FunctionalInterface
interface square
{
public  int squareANumber(int a);
}

public class SquareANumber
{
	public static void main(String[] args) {
		square s=(number)->number*number;
		System.out.println(s.squareANumber(50));

	}
}
