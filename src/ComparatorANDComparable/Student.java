package ComparatorANDComparable;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	public String name;
	public Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compare(Student o1, Student o2) {

		// return o1.getName().compareTo(o2.getName());
		return o1.getAge().compareTo(o2.getAge());

	}

}
