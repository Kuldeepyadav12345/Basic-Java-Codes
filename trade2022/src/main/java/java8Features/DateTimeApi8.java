package java8Features;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApi8 {
	public static void dateTimeApi()
	{
		 // the current date
	    LocalDate date = LocalDate.now();
	    System.out.println("the current date is "+date);
	  
	    // the current time
	    LocalTime time = LocalTime.now();
	    System.out.println("the current time is "+time);      
	  
	    // will give us the current time and date
	    LocalDateTime current = LocalDateTime.now();
	    System.out.println("current date and time : "+current);
	    
	    // to print in a particular format
	    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy:HH:mm:ss");
	    String formateddate=df.format(current);
	    System.out.println(formateddate);
	    
	    // printing months days and seconds
	    Month month=current.getMonth();
	    int datee=current.getDayOfMonth();
	    int year =current.getYear();
	    System.out.println(datee +"  "+month +"  "+ year);
	    
	    
	    
	    
	    
	    
	}
public static void main(String[] args) {
	dateTimeApi();
}
}
