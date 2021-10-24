package Scanners;

import java.util.Scanner;

public class TakeInputAndPrint {

	public static void main(String[] args) {
		System.out.println("HELLO :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Int :");
		int i=sc.nextInt();
		System.out.println("String :");
		String s=sc.nextLine();
		System.out.println("Double :");
		double d=sc.nextDouble();
		System.out.println("String :");
		System.out.println("String :"+s);
		System.out.println("Int is :"+i);
		System.out.println("Double is :"+d);

	}

}
