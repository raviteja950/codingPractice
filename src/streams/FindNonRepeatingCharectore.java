package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNonRepeatingCharectore {

	public static void main(String[] args) {

		String s = "aabbcde";

		Character result = s.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

		System.out.println(result);

		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee("Ram", 2000.0);
		Employee emp2 = new Employee("seta", 5000.0);
		list.add(emp2);
		list.add(emp1);

		Optional<Employee> result1 = list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(result1.get().getName() + " " + result1.get().getSalary());

//		for (Employee employee : result1) {
//			System.out.println(employee.getName()+" "+employee.getSalary());
//		}

		List<Integer> Arraylist = Arrays.asList(1, 2, 3, 5);

		System.out.println(Arraylist);

		List<Integer> res = s.chars().boxed().collect(Collectors.toList());
		System.out.println(res);

	}

}
