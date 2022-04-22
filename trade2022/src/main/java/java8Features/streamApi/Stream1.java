package java8Features.streamApi;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;

class Stream1 {
   public static void main(String[] args) {
	   ArrayList<Integer> aa=new ArrayList<Integer>();
		aa.add(10);
		aa.add(50);
		aa.add(85);
		aa.add(90);
		aa.add(100);
		List<Integer> l= aa.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
}
	
}
















