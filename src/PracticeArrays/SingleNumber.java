package PracticeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {

	public static void main(String args[]) {

		int a[] = {4,1,2,1,2 };

		Integer result = Arrays.stream(a).mapToObj(e -> e)
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e ->e.getValue()==1).map(Map.Entry::getKey).findAny().get();

		System.out.println(result);


	}
}
