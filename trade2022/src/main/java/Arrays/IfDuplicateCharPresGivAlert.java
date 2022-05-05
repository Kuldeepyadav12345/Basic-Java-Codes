package Arrays;

public class IfDuplicateCharPresGivAlert {

	public static void main(String[] args) {
		String s="aaaabcdd";
		for (int i = 1; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i));
					j++;
					i++;
				}
			}
			
			
		}

	}

}
