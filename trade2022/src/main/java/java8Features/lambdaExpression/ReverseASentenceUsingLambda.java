package java8Features.lambdaExpression;

import java.util.function.Consumer;

public class ReverseASentenceUsingLambda {

	public static void main(String[] args) {
		Consumer<String> c=(e)->
		{
			String temp="";
			System.out.print("Original String = "+ e);
			System.out.println("");
			String[] words=e.split(" ");
			for (int i = words.length-1; i >=0; i--) {
				temp=temp+words[i]+" ";
			}
			System.out.println("Reversed String ="+ temp);
		};
		c.accept("How are You");

	}

}
