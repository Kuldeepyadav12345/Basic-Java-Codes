package java8Features.FunctionalInterface;

import java.util.function.Supplier;


public class _Supplier {

public static void main(String[] args) {
	System.out.println(getDBConnectionURL());
	System.out.println(getUrl.get());
	
}
 static String  getDBConnectionURL()
{
	return "jdbc://localhost:5432/user";
}
 
 static Supplier<String> getUrl=()->"jdbc://localhost:5432/user";
}