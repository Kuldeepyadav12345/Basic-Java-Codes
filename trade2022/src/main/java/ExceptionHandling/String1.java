package ExceptionHandling;

public class String1 {

	public static void main(String[] args) {
		String str="JavaTpoint";
		try
		{
			char c=str.charAt(55);
			throw new CustomException("This is a custom message");
			
			
	      } catch(CustomException e) {
	         System.out.println(e);
	      }
	}

}
class CustomException extends Exception {
	   String message="Custome Exception";
	   CustomException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
	}
