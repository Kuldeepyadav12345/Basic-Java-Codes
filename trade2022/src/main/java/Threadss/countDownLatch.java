package Threadss;

import java.util.concurrent.CountDownLatch;

public class countDownLatch {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch c = new CountDownLatch(4);
		Worker first = new Worker(1000, c, "Woker 1");
		Worker second = new Worker(2000, c, "Woker 2");
		Worker third = new Worker(3000, c, "Woker 3");
		Worker forth = new Worker(4000, c, "Woker 4");
		first.start();
		second.start();
		third.start();
		forth.start();
		c.await();
		System.out.println(Thread.currentThread().getName() + " has finished");
		 System.out.println("Files are read ... Start further processing");
		 Worker f = new Worker(1000, c, "Woker 1");
			Worker s = new Worker(2000, c, "Woker 2");
			Worker t = new Worker(3000, c, "Woker 3");
			Worker fo = new Worker(4000, c, "Woker 4");
			f.start();
			s.start();
			t.start();
			fo.start();
			c.await();
			System.out.println(Thread.currentThread().getName() + " has finished");
		  }

	}



class Worker extends Thread {
	private int delay;
	private CountDownLatch latch;
	private String Name;

	public Worker(int delay, CountDownLatch latch, String name) {
		super();
		this.delay = delay;
		this.latch = latch;
		this.Name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " Finished");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}