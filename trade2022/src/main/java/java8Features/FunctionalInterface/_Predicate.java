package java8Features.FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		System.out.println("Using normal method =="+isphoneNoValid("9967800695"));
		System.out.println("Using Functional Interface == "+isNumberValid.test("9965845658"));
	}
	static boolean isphoneNoValid(String mobileNo)
	{
		return mobileNo.startsWith("99") && mobileNo.length()==10;
	}

	static Predicate<String> isNumberValid=mobileNo->mobileNo.startsWith("99") && mobileNo.length()==10;
}
