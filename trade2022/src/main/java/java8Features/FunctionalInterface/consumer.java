package java8Features.FunctionalInterface;

public class consumer {
	public static void main(String[] args) {
		greetCustomer(new Consumer("Kuldeep", "123456789"));
		greetCustomer(new Consumer("Kuldeep", "123456789") );
		
	}

	
	//normal way 
	static void greetCustomer(Consumer customer) 
	{
		System.out.println("Hello " + customer.customerName + " Thanks for Registering your mobile no is "
				+ customer.cusotmerMobileNumber);

	}
	//Using functional interfaces
	static java.util.function.Consumer<Consumer> greet = cunsumer -> System.out.println("Hello " + cunsumer.customerName
			+ " Thanks for Registering your mobile no is " + cunsumer.cusotmerMobileNumber);

	static class Consumer {
		private String customerName;
		private String cusotmerMobileNumber;

		public Consumer(String customerName, String cusotmerMobileNumber) {
			super();
			this.customerName = customerName;
			this.cusotmerMobileNumber = cusotmerMobileNumber;
		}

	}

}
