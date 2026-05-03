package PracticeArrays;

import java.util.HashMap;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1};

//		int k = 2;
//		int c = 0;
//
//		for (int i = 0; i < a.length; i++) {
//
//			int sum=0;
//			System.out.println("For value :" + a[i]);
//
//			for (int j = i; j < a.length; j++) {
//
//				 sum+=a[j];
//				if (sum == k) {
//					System.out.println(a[i] + " " + a[j] + " = " + k);
//					c++;
//				}
//				System.out.println(a[i] + " " + a[j]);
//			}
//		}
//		System.out.println("count value");
//		System.out.println(c);

		// prifix Arrays

		int p[] = new int[a.length];
		int k = 0;

		p[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			p[i] = p[i - 1] + a[i];
		}

		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}

		System.out.println();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	
			map.put(0, 1);
			int currentSum = 0;
			int count = 0;

			for (int i = 0; i < a.length; i++) {
				currentSum += a[i];
				int finadVale = currentSum - k;

				if (map.containsKey(finadVale)) {
					count += map.get(finadVale);

				}

				map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

			}
			System.out.println(count);
		}
	
	
}
