package java8Features.DateTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimee {

	public static void main(String[] args) {
		// it stores the time
		LocalTime t1=LocalTime.now();
		int min=t1.getMinute();
		int hr=t1.getHour();
		int sec=t1.getSecond();
		//System.out.println(hr+"  "+min+"  "+sec);
		LocalTime t2=LocalTime.parse("12:55:55");
	//	System.out.println(t2);

	LocalDate d=LocalDate.now();
	System.out.println(d.plusDays(5));

	

	
}
}
