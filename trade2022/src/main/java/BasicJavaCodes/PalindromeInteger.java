package BasicJavaCodes;

import java.util.ArrayList;

public class PalindromeInteger {

	public static void main(String[] args) {
		String Input="abccaaaced";
		ArrayList a=new ArrayList<Object>(Input.length()-1);
		a.add(Input);
		int midd=(Input.length()/2);
		System.out.println(a.indexOf(midd));
		if(a.indexOf(midd)==a.indexOf(midd-1)   && (a.indexOf(midd)==a.indexOf(midd+1)))
		{
			System.out.println(a.indexOf(5));
			//a.remove(midd-1);
			System.out.println(a);
		}

	}

}
