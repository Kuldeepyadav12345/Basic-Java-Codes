package java8Features.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

//WAP USING BiFunction that accepts takes two Integers and returns an Integer, Double or List
public class BiFunction {
public static void main(String[] args) {
	java.util.function.BiFunction<Integer, Integer, Integer> funct=(x,y)->x+y;
	java.util.function.BiFunction<Integer, Integer, Double> funct2=(x,y)->Math.pow(x, y);
	java.util.function.BiFunction<Integer, Integer, List> funct3=(x,y)->Arrays.asList(x+y);
	Integer result1=funct.apply(5, 5);
	Double result2=funct2.apply(5, 5);
	List result3=funct3.apply(5, 5);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
}
}
