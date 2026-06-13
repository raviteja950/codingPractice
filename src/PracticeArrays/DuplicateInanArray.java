package PracticeArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DuplicateInanArray {

	public static void main(String args[]) {

		int a[] = { 1, 2, 4, 2 };
		HashSet<Integer> set = new HashSet<Integer>();

		List<Integer> r = Arrays.stream(a).boxed().filter(e -> !set.add(e)).collect(Collectors.toList());
		System.out.println(r);
	}
}
