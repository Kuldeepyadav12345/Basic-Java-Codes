package java8Features.FunctionalInterface;


interface parent
{
	public static void showmessage() {
		System.out.println("helloworld");
	}
	public default int parentmetod()
	{
		return 1;
	}
}
@FunctionalInterface
public interface FunctionalInterface1 extends parent{
	public int child();

}

class hello implements parent
{
	@Override
	public  int parentmetod()
	{
		return 1;
	}
	
}
