package java8Features.FunctionalInterface;
// WAP using Function<T,R> thats accepts an string and returns the length of the string 

import java.util.function.Function;

public class ReturnLenOfString {
public static void main(String[] args) {
	Function<String, Integer> lengthOfString =str->str.length();
	int length=lengthOfString.apply("Hello");
	System.out.println("Length of string is :- "+ length);
}
}
