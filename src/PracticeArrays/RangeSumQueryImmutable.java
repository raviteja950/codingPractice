package PracticeArrays;

public class RangeSumQueryImmutable {

	public static int sumRange(int l, int r, int p[]) {

		if (l == 0) {
			return p[r];
		} else {
			return p[r] - p[l - 1];
		}

	}

	public static void main(String[] args) {

		// this are ranges [0, 2], [2, 5], [0, 5] you need to get subArray sum between
		// this range
		int a[] = { -2, 0, 3, -5, 2, -1 };
		//int l = 0, r = 2;
		//int l = 2, r = 5;
		int l = 0, r = 5;

		int p[] = new int[a.length];

		p[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			p[i] = p[i - 1] + a[i];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();

		System.out.println(sumRange(l, r, p));

	}

}
