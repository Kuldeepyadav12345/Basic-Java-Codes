package BasicJavaCodes;

//Java program for the above approach

import java.lang.*;
import java.util.*;

class ArraySplit {

	// Function to find the minimum length
	// of the string after removing the same
	// characters from the end and front of the
	// two strings after dividing into 2 substrings
	static int minLength(String s)
	{
		// Initialize two pointers
		int i = 0, j = s.length() - 1;

		// Traverse the string S
		for (; i < j
			&& s.charAt(i) == s.charAt(j);) {

			// Current char on left pointer
			char d = s.charAt(i);

			// Shift i towards right
			while (i <= j
				&& s.charAt(i) == d)
				i++;

			// Shift j towards left
			while (i <= j
				&& s.charAt(j) == d)
				j--;
		}

		// Return the minimum possible
		// length of string
		return j - i + 1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String S = "aabcccabba";
		System.out.println(minLength(S));
	}
}
