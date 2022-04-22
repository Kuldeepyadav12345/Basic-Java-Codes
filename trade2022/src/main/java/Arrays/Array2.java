package Arrays;
import java.util.*;
import java.util.stream.Stream;
public class Array2 {

	public static void main(String[] args) {
		int arr[]= {2,4,3};   ////020
		int arr2[]=arr.clone();
		int a=0;
		int[] arr3=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			if(i==0)
			{
				arr3[i]=0;
			}
			else
			{
				a=arr[0]+(arr[i]-arr[i-1]);
				arr3[i]=a;
			}
		}
		for (int i : arr3) {
			System.out.println(i);
			
		}
	
	}

}
