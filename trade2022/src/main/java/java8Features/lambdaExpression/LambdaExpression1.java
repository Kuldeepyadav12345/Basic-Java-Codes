package java8Features.lambdaExpression;
import java.util.function.*;
public class LambdaExpression1 {
	@FunctionalInterface
	interface Drawable
	{
		public void draw();
	}
	public static void main(String[] args) {
		int a=10;
		Drawable d1=new Drawable() {
			@Override
			public void draw() {
				System.out.println("Normal method "+a);
				
			}
		};
		Drawable d=()->{
			System.out.println("Lambda FN for Local variable "+a);
		};
		d1.draw();
		d.draw();
	}

}
