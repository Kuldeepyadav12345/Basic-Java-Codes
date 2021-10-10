package Iterators;

/*Calling one constructor from another constructor is called as constructor chaining 
 * When we have multiple task to perform instead of writing all the code in single constructor we write it in 
 * different constructor based on the task
 * Constructor chaining could happen in two ways with this() keyword for same class
 *  and with super() keyword in other classes with the help of extends keyword
 * 
 * 
 */
public class ConstructorChaining {

	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining(5,6);
		

	}
	public ConstructorChaining() {
		System.out.println("Defailt of ConstructorChaining class");
	}
	ConstructorChaining(int a)
	{
		this();
		System.out.println(a);
	}
	ConstructorChaining(int a ,int b)
	{
		this(5);
		System.out.println(a+b);
	}

}

