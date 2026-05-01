package PracticeArrays;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {9,6,4,2,3,5,7,0,1};
       int n =a.length;
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
       
       
       
       //Approcach-2
       int sum=0;
       for(int i=0;i<n;i++) {
    	   sum+=a[i];
       }
      int naturalNumberSum= (n*(n+1))/2;
      System.out.println(naturalNumberSum-sum);
       
	}

}
