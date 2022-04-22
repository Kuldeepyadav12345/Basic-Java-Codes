package anonymousInnerClass;

public class CreateAAnnoClassByImplemAnInterface {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable Interface thread");

			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");

	}

}
