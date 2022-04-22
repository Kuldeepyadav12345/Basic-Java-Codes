package BasicJavaCodes;

public class FindOutput {
	int method()
	{
		//return(true:1?0);  here we will get Syntatic error
		return(true?1:0);
	}
	public static void main(String[] args) {
	FindOutput val=new FindOutput();
	System.out.println(val.method());

	}

}
