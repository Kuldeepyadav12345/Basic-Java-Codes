package Strings;

import java.util.StringTokenizer;

//Wap for string tokenizer in java
public class String4 {

	public static void main(String[] args) {
	String str="Geek for Geek";
	StringTokenizer s=new StringTokenizer(str);
	while(s.hasMoreElements())
	{
		System.out.println(s.nextElement());
	}

	}

}
