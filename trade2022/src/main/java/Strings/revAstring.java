package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class revAstring {

	public static void main(String[] args) {
		String s="aabbcc";
		char[] c=s.toCharArray();
		String s1="";
		for (int i = c.length-1; i >=0 ; i--) {
			String temp="";
			temp=temp+c[i];
			if(s1.contains(temp))
			{
			
			}
		else
		{
			s1=s1+c[i];
		}
		temp="";
	}
		System.out.println(s1);
}
}
