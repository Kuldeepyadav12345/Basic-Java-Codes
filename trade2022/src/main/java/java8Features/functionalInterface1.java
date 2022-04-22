package java8Features;

@FunctionalInterface
interface Area
{
	void area(int x);
}

public class functionalInterface1 implements Area {

	
	public static void main(String[] args) {
		Area a=(x)->{
			System.out.println("Area is: "+x*x);
		};
		a.area(5);
	}
	@Override
	public void area(int x) {
		// TODO Auto-generated method stub	
	}


}
