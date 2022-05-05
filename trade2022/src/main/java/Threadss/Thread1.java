package Threadss;
// by extending the thread class
public class Thread1 extends Thread{

	public void run()
	{
		int i;
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		Thread d=new Thread(t);
		Thread d1=new Thread(t);
		d.start();
		d1.start();
	}

}
