package java8Features;

@FunctionalInterface
public interface Inter {
 abstract void show();    
 // Functional interface should have only one abstract method
 //abstract void hide();
}
@FunctionalInterface
interface b extends Inter
{
	
}
