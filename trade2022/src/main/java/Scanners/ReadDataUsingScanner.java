package Scanners;
import java.util.Scanner;
/*// Java program to read data of various types using Scanner class.*/
public class ReadDataUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Name");
		String str=sc.next();
		System.out.println("Please enter Age");
		int a=sc.nextInt();
		System.out.println("Please enter Standard");
		short s=sc.nextShort();
		System.out.println("Please enter Mobile no");
		long d=sc.nextLong();
		System.out.println("Please Enter Gender");
		char gen=sc.next().charAt(0);
		System.out.println("Entered Name is "+str);
		System.out.println("Entered Age is "+a);
		System.out.println("Entered Standard is "+s);
		System.out.println("Entered Mobile No is "+d);
		System.out.println("Gender is "+gen);
		

	}

}
