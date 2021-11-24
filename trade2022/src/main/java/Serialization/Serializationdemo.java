package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializationdemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream f1=new FileOutputStream("test.txt");
		ObjectOutputStream o=new ObjectOutputStream(f1);
		Student s=new Student();
		o.writeObject(s);
	
	InputStream f2=new FileInputStream("test.txt");
	ObjectInputStream os = new ObjectInputStream(f2);
	Student s2=(Student) os.readObject();
	System.out.println(s2);
	
	
	
	
	}

}
