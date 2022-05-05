package ExceptionHandling;

public class CustomeExcpeiton {
	public static void main(String[] args) {
		int age =60;
		if(age>=60)
		{
			throw new notAString("not a String");
		}
	}
	
}


class notAString extends RuntimeException
{
	public notAString(String string) {
		super(string);
	}

	
}