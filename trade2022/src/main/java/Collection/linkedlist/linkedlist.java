package Collection.linkedlist;
import java.util.*;
/*Linked list maintains the insertion order*/
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("kuldeep");
		l.add("Sam");
		l.add("Ram");
		l.add("Sham");
		System.out.println(l);
		l.push("Gaurav");
		System.out.println(l);
		l.listIterator(0);
		System.out.println(l.listIterator(0));
	}
	

}
