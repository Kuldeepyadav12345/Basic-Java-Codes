package BasicJavaCodes;

import java.util.ArrayList;

public class PalindromeInteger {

	public static void main(String[] args) {
		String Input="aba";
		/*ArrayList a=new ArrayList<Object>(Input.length()-1);
		a.add(Input);
		int midd=(Input.length()/2);
		System.out.println(a.indexOf(midd));
		if(a.indexOf(midd)==a.indexOf(midd-1)   && (a.indexOf(midd)==a.indexOf(midd+1)))
		{
			System.out.println(a.indexOf(5));
			//a.remove(midd-1);
			System.out.println(a);
		}*/
		StringBuilder rev=new StringBuilder(Input);
		rev.reverse();
		System.out.println(Input);
		System.out.println(rev);
		if(Input.equals(rev.toString()))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome ");
		}

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
