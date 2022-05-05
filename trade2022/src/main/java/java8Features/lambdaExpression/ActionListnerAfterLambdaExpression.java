package java8Features.lambdaExpression;

import java.awt.Button;
import java.awt.Frame;

public class ActionListnerAfterLambdaExpression {

	public static void main(String[] args) {
		Frame frame =new Frame("Action Listner After lambda expression");
		frame.setBounds(40,40,40,40);
		Button b=new Button("Click me ");
		b.addActionListener((a)->System.out.println("Lambda Expression"));
		frame.add(b);
		frame.setSize(200,200);
		frame.setVisible(true);
	}

}
