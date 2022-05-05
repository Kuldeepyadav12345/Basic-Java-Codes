package Design_Patterns.Factory_Design_Pattern;

public class ShapeFactory {
	public Shape getShape(String shape)
	{
		if(shape==null)
		{
			return null;
		}
		else if(shape.equals("Circle"))
		{
			return new Circle();
		}
		else if(shape.equals("rectangle"))
		{
			return new Circle();
		}
		else if(shape.equals("Square"))
		{
			return new Circle();
		}
		return null;
	}
}
