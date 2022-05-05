package java8Features.lambdaExpression;

@FunctionalInterface
interface Noparamater {
	public String returnString();
}

public class lambdaWithNoParamater {

	public static void main(String[] args) {
		Noparamater m = () -> {
			return "Hello World";
		};
		System.out.println(m.returnString());

	}

}
