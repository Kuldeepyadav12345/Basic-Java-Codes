package Strings;
import java.util.*;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer str=new StringBuffer(s);
		str.reverse();
		String s2=str.toString();
		if(s.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
