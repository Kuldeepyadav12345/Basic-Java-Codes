package binary;
import java.util.*;
public class AddString {
	public static String AddStrings(String num1, String num2) 
	{
		String res="";
		int carry=0;
		int i=num1.length()-1;
		int j=num2.length()-1;
		
		
		while(i>=0 || j>=0 || carry !=0)
		{
			//Because string.charAt(i) returns char. But puz is int[].So string.charAt(i) - '0'converts it to an integer.
			//Here num1.charAt(i) returns a character hence to convert it to integer we use num1.charAt(i) -'0'
			int ival=i>=0? num1.charAt(i) -'0' : 0;
			int jval=i>=0? num2.charAt(i) -'0' : 0;
			i--;
			j--;
			int sum=ival+jval+carry;
			res=(sum %10) +res;
			carry=sum/10;
		}
		return res;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n1=sc.nextLine();
	String n2=sc.nextLine();
	String res=AddStrings(n1,n2);
	System.out.println(res);
	
}
}
