package Arrays;

public class findSecondLowestInArry {

	public static void main(String[] args) {
		int arr[] = {1,6,5,9,10,4};
		int firstLowest=arr[0];
		int secondLowest=arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstLowest) {
				// Assign highest value into secondhigest
				secondLowest = firstLowest;
				// Set new highest
				firstLowest = arr[i];
				}
				// If number is less than highest and greater than secondHighest
				if (arr[i] > firstLowest && arr[i] < secondLowest) {
				// Set second highest
					secondLowest = arr[i];
				}
		}
		System.out.println("Second Lowest is =" +secondLowest);
	}

}
