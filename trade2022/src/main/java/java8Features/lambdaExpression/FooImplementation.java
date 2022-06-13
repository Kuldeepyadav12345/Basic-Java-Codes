package java8Features.lambdaExpression;

interface Foo {
	// Default Method - Optional can be 0 or more
	public default String HelloWorld() {
		return "Hello World";
	}

	// Static Method - Optional can be 0 or more
	public static String CustomMessage(String msg) {
		return msg;
	}

	// Single Abstract Method
	public void bar();
}

public class FooImplementation implements Foo{
	public static void main(String[] args) {
		FooImplementation fi = new FooImplementation();
		System.out.println(fi.HelloWorld());
		System.out.println(Foo.CustomMessage("Hi"));
		fi.bar();
	}

	@Override
	public void bar() {
		System.out.println("Helloworld");
		
	}

}
