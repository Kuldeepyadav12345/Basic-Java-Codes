package Strings;

public class reverseAString {

	public static void main(String[] args) {
		String str="helloWorld";
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		      //  rev+=ch[i];  
		        rev=rev+ch[i];
		    }  
		    System.out.println(rev);

	}

}
