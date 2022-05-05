package java8Features.lambdaExpression;

@FunctionalInterface
interface oneParamater {
	public int oneParamaterLambda(int x);
}

@FunctionalInterface
interface twoParameterLambda {
	public int twoParam(int x, int y);
}
@FunctionalInterface
interface threeParamater
{
	public int threeParamater(int x, int y, int z);
}

public class lambdaWithParameters {

	public static void main(String[] args) {
		oneParamater one = (x) -> {
			return x + x + x;
		};
		System.out.println("One paramater Result =" + one.oneParamaterLambda(10));

		twoParameterLambda two = (x, y) -> {
			return x + y;
		};
		System.out.println("Two parameter lambda " + two.twoParam(10, 50));
		
		threeParamater three=(x,y,z)->
		{
			return x+y+z;
		};
		System.out.println("Three paramater " +three.threeParamater(5, 5, 5));
	}

}
