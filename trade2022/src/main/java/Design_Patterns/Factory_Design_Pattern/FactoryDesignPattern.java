package Design_Patterns.Factory_Design_Pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeFactory shape = new ShapeFactory();
		Shape s1 = shape.getShape("Circle");
		s1.draw();

	}

}
