package Strings;
//program to declare a character array and convert it into a string
public class String1 {

	public static void main(String[] args) {
	char[] a= {'a','b','c','d','e'};
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
	System.out.println("");
	String str=new String(a);
	System.out.println("Converted Char array to string---->>>"+str);
	}

}
