package java8Features.DateTimeApi;

import java.time.LocalDate;

public class LocalDatee {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 9);
		System.out.println(date1);
		System.out.println(date2.getDayOfMonth());
		Boolean leapyear=date2.isLeapYear();
		System.out.println(leapyear);

	}

}
