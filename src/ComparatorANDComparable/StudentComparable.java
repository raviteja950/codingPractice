package ComparatorANDComparable;

public class StudentComparable implements Comparable<StudentComparable> {

	private String name;
	private Integer age;

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

	public StudentComparable(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable o) {
		return this.getName().compareTo(o.getName());
	}

}
