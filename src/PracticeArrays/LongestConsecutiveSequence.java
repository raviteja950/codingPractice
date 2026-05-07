package PracticeArrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 7, 8 };
//		int maxCount=1;
//		int currentCount=1;
//		
//		if(a.length!=0) {
//		Arrays.sort(a);
//		
//		
//		for(int i=0;i<a.length-1;i++) {
//			
//			if(a[i+1]==a[i]) {
//				continue;
//			}
//			if(a[i+1]-a[i]==1) {
//				currentCount++;
//			}
//			else {
//				 maxCount = Math.max(maxCount, currentCount);
//			        currentCount = 1;
//			}
//		}
//		System.out.println( Math.max(maxCount, currentCount));
//		}
//		else {
//			System.out.println(0);
//		}

		// optimal approach

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		int max = 0;
		for (int num : set) {

			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentCount = 1;

				while (set.contains(currentNum + 1)) {
					currentCount++;
					currentNum++;
				}

				max = Math.max(max, currentCount);
			}
		}
		System.out.println(max);

	}

}
