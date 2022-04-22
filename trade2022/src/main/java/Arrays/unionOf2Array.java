package Arrays;
import java.util.*;
public class unionOf2Array {
public static void main(String[] args) {
	int arr1[] = {1,25,4,2,6};
	int arr2[] = {5,3,2,7};
	System.out.println("1st Given Unsorted Array"+Arrays.toString(arr1));
	System.out.println("2nd Given Unsorted Array"+Arrays.toString(arr2));
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println("1st Sorted Array"+Arrays.toString(arr1));
	System.out.println("2nd Sorted Array"+Arrays.toString(arr2));
	int m=arr1.length;
	int n=arr2.length;
	printUnion(arr1,arr2,m,n);
}

private static int printUnion(int[] arr1, int[] arr2, int m, int n) {
	// TODO Auto-generated method stub
	
int i=0;
int j=0;
while (i < m && j < n) {
    if (arr1[i] < arr2[j])
        System.out.print(arr1[i++] + " ");
    else if (arr2[j] < arr1[i])
        System.out.print(arr2[j++] + " ");
    else {
        System.out.print(arr2[j++] + " ");
        i++;
    }
}

/* Print remaining elements of
 the larger array */
while (i < m)
    System.out.print(arr1[i++] + " ");
while (j < n)
    System.out.print(arr2[j++] + " ");

return 0;
}
}
