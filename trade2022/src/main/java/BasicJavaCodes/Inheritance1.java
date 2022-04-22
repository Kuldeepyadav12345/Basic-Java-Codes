package BasicJavaCodes;


 class B extends C
{
	B()
	{
		System.out.println("Class B constructor");
	}
	void display()
	
	{
		System.out.println("Display  method of class B");
	}
}
 class Inheritance1 extends B
{
	 Inheritance1()
	{
		System.out.println("Class C constructor");
	}
	 void display()
		
		{
			System.out.println("Display  method of class Inheritance1");
		}
	public static void main(String[] args) {
		System.out.println("sdsd");
		Inheritance1 obj=new Inheritance1();
		B obj2=new B();
		obj2.display();
		
	}
	
}