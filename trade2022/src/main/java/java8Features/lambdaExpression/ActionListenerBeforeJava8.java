package java8Features.lambdaExpression;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerBeforeJava8 {

	public static void main(String[] args) {
		Frame frame=new Frame("Anonymous inner class before lambda expression");
		Button b=new Button("CLick me ");
		b.setBounds(20, 20, 20, 20);
		b.setName("Click me ");
		//b.setBackground(null);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World After Clicking  ");
				
			}
		});
		frame.add(b);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}