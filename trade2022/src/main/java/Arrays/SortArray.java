package Arrays;
import java.util.*;
public class SortArray {
public static void main(String[] args) {
	int arr[]= {-20,-30,5,55,1,2};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(arr[0]);
	System.out.println(arr[arr.length-1]);
}
}
