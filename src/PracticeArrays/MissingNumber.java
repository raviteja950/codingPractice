package PracticeArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int n = a.length;
//       
//       int missingNumber=0;
//       HashSet<Integer> s= new HashSet<Integer>();
//       for(int i=0;i<n;i++) {
//    	   s.add(a[i]);
//       }
//       
//       for(int i=0;i<=n;i++) {
//    	   
//    	   if(!s.contains(i)) {
//    		   missingNumber=i;
//    	   }
//       }
//       System.out.println(missingNumber);

		// streams
		Set<Integer> set = Arrays.stream(a).mapToObj(e -> e).collect(Collectors.toSet());
		System.out.print(set);

		List<Integer> List = IntStream.range(0, n).filter(value -> !set.contains(value)).boxed()
				.collect(Collectors.toList());
		System.out.println(List);

		// Approcach-2
//       int sum=0;
//       for(int i=0;i<n;i++) {
//    	   sum+=a[i];
//       }
//      int naturalNumberSum= (n*(n+1))/2;
//      System.out.println(naturalNumberSum-sum);

	}

}
