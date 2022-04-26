package java8Features.MethodReference;

import java.util.Arrays;
import java.util.List;

import com.sun.tools.javac.util.StringUtils;

public class capatilizeAllWords {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("Anna","Julie","Max");
		l.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));

	}

}
