package java8Features.lambdaExpression;

public class addTwoNumbersusingLambdaExp {

	@FunctionalInterface
	interface addTwoNumber {
		public double addXAndY(int x, int y);
	}

	@FunctionalInterface
	interface subrtaceTwoNumbers {
		public double subtract(int x, int y);
	}

	@FunctionalInterface
	interface multiplyTwoNumbers {
		public double Multiply(int x, int y);
	}

	@FunctionalInterface
	interface divide {
		public double DivideNumbers(int x, int y);

	}

	public static void main(String[] args) {
		addTwoNumber addition = (x, y) -> x + y;
		System.out.println("Addition is " + addition.addXAndY(10, 20));

		// Subtraction using lambda
		subrtaceTwoNumbers sub = (x, y) -> x - y;
		System.out.println("Subtraction using lambda " + sub.subtract(10, 20));

		// Multiplication using lambda expression
		multiplyTwoNumbers m = (x, y) -> x * y;
		System.out.println("Multiplication of two numbers is " + m.Multiply(5, 5));

		// Divide the numbers using lambda expression
		divide d = (x, y) -> x / y;
		System.out.println("Division of numbers is " + d.DivideNumbers(10, 5));

	}

}
