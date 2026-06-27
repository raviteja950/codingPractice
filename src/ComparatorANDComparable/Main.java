package ComparatorANDComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {
		Integer a[] = { 2, 1, 3, 4 };

		List<Integer> list = Arrays.asList(a);
		Collections.sort(list, new ComparoterHelper());
		System.out.println(list);

		Student one = new Student("ram", 12);
		Student two = new Student("kiram", 13);
		Student three = new Student("ramK", 15);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(one);
		studentList.add(two);
		studentList.add(three);

		Collections.sort(studentList, new StudentComparator());
		studentList.forEach(e -> System.out.println(e.getName() + " " + e.getAge()));

		StudentComparable sone = new StudentComparable("level1", 12);
		StudentComparable stwo = new StudentComparable("rakesh", 13);
		StudentComparable sthree = new StudentComparable("bit", 15);

		List<StudentComparable> ComparableStudentList = new ArrayList<StudentComparable>();
		ComparableStudentList.add(sone);
		ComparableStudentList.add(stwo);
		ComparableStudentList.add(sthree);
		
		Collections.sort(ComparableStudentList);
		
		ComparableStudentList.forEach(e -> System.out.println(e.getName() + " " + e.getAge()));
	}
}
