package Arrays;

import java.util.Iterator;

public class RecursionExample4
{
public int min(){
	  int a[] ={88,5,1,3,55,6};
	  int min=a[0];int max=a[0];
	  int minimum=0;
	  int maximum=0;
	  int secondMin = 0;
	  for(int i=0;i<a.length;i++){
	        if(min>a[i]){
	        	min= a[i];
	           }
	      }
	  for(int i=0;i<a.length;i++){
	        if(max<a[i]){
	        	max= a[i];
	           }
	      }
	  for (int i = 0; i < a.length; i++) {
		  secondMin=a[a.length-1];
		  System.out.println(a[i]);
		  if(max>a[i] && a[i]!=min){
			  minimum= a[i];
	           }
		
	}
	 
	  System.out.println(minimum);
	  return secondMin;
	}
public static void main(String[] args) {
	RecursionExample4 r= new RecursionExample4();
	r.min();
	
}
}