package java8Features.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerr {
	public static void main(String[] args) {
		cust.accept(new customer("ALEX", "123456789"), false);
	}

	static BiConsumer<customer, Boolean> cust = (customer, showMobNo) -> System.out.println("Hello " + customer.consumername
			+ " Thanks for Registering your mobile no is " + (showMobNo ? customer.mobileNumber : "********"));

	static class customer {
		private String consumername;
		private String mobileNumber;

		public customer(String consumername, String mobileNumber) {
			super();
			this.consumername = consumername;
			this.mobileNumber = mobileNumber;
		}

	}
}
