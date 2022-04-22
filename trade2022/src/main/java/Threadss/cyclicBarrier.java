package Threadss;
// Java program to demonstrate

// execution on Cyclic Barrier

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class cyclicBarrier implements Runnable {
public static void main(String[] args)
{
	cyclicBarrier c=new cyclicBarrier();
	Thread t1=new Thread(c);
	t1.start();
}
	@Override
	public void run() {
		//System.out.println("No of parties Requied to trip the barrier"+ newBarrier.getParties());
		
	}

	// create a static CyclicBarrier instance
}
