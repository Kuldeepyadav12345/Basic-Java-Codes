package java8Features.lambdaExpression;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;


public class Lambda3 {

  public static void main(String[] args) {
	  String s="Welcome to Techndeck.com";
	  reverse_character_in_words(s);
	
}

private static void reverse_character_in_words(String str) {
	
String [] word=str.split(" ");
Stream<String> s=Arrays.stream(word);
s.forEach(s1-> {
	System.out.println(s1);
	Function<String, String> l=f->new StringBuilder(s1).reverse().toString();
	String reverse=l.apply(s1);
	System.out.println(reverse+"\n");
	
});
}
}

