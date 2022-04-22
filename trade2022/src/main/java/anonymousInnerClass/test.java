package anonymousInnerClass;

public class test {

	public static void main(String[] args) {
		calculator c = new calculator();
		System.out.println(c.calculate(5, 5));

		// using annonymous inner class
		calculator c2 = new calculator() {
			@Override
			public int calculate(int x, int y) {
				return x - y;
			}
		};
		System.out.println("Subtraction is  "+c2.calculate(4, 2));
	}

}
