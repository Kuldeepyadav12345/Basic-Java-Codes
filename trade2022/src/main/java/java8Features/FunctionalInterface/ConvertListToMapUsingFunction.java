package java8Features.FunctionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ConvertListToMapUsingFunction {
	static ConvertListToMapUsingFunction obj = new ConvertListToMapUsingFunction();

public static void main(String[] args) {
	List<String> list=Arrays.asList("Node","java","C++","Javascript");
	Map<String,Integer> map=obj.convertListToMap(list, x -> x.length());
	System.out.println(map);
}

public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

	Map<T, R> result = new HashMap<>();
	for (T t : list) {
		result.put(t, func.apply(t));
	}
	return result;

}

public Integer getLength(String str) {
	return str.length();
}
}
