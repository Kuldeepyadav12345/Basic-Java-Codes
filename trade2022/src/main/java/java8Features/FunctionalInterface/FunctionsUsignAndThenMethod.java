package java8Features.FunctionalInterface;

import java.util.function.Function;
// WAP to return the length of the string and double the length using andthen methoud using function in java8
public class FunctionsUsignAndThenMethod {
public static void main(String[] args) {
	Function<String , Integer> StringLength=str->str.length();
	Function<Integer, Integer> doubleStrValue=lengthofString->lengthofString*2;
	int finalLength=StringLength.andThen(doubleStrValue).apply("Hello");
	System.out.println(finalLength);
}
}
