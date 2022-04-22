package java8Features;
import java.util.function.*;

public class java81 {

	
	public static int square(int n)
	{
		return n*n;
		
	}
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;//  3 lines of code in one line with java 8
		Predicate<Integer> p=i->i%2==0;
		System.out.println("Normal way  "+square(5));
		System.out.println("Normal way  "+square(6));
		System.out.println("");
		System.out.println("With java 8 features  "+f.apply(5));
		System.out.println("With java 8 features  "+f.apply(6));
		System.out.println("");
		System.out.println("With java 8 features  "+p.test(5));
		System.out.println("With java 8 features  "+p.test(6));

	}

}
