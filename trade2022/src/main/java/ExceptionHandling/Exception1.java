package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		int age=10;
		if(age>60)
		{
			throw new toold("You are too old");
		}
		else if(age<18)
		{
			throw new Toyoung("You are too old");
		}
	}
}
class toold extends RuntimeException
{
	public toold(String string) {
		super(string);
	}
}
class Toyoung extends RuntimeException
{
	public Toyoung(String string) {
		super(string);
	}
}
