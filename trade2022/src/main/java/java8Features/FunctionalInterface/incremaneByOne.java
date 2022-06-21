package java8Features.FunctionalInterface;

import java.util.function.Function;

public class incremaneByOne {
public static void main(String[] args) {
	int incrementedValue=incrementNumber(1);
	int numberFromFunctionalInterface=incrementNumber(2);
	System.out.println(incrementedValue);
	System.out.println(numberFromFunctionalInterface);
}

Function<Integer, Integer> incrementNumber=number->++number;

public static int  incrementNumber(int number)
{
	number +=1;
	return number;
}
}
