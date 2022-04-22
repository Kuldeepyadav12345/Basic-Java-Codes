package java8Features.lambdaExpression;

public class lambdaEmpressionAdd {
	public static void main(String[] args) {
	calCulate c=(x,y)->x+y;  //Lambda expression fr addition 
	
	calCulate c2=(x,y)->
	{
	return x*y;// lambda expression for multiplication 
	};
	calCulate c3=(x,y)->{
		return x/y;
	};
	calCulate c4=(x,y)->{
		return x-y;
	};
	
	System.out.println("Addition is= "+ c.operation(5, 5));
	System.out.println("Subtraction  is="+ c4.operation(5, 5));
	System.out.println("Multiplication is= " +c2.operation(5, 5));
	System.out.println("Division  is= "+ c3.operation(5, 5));
	
	
	}
	
}
