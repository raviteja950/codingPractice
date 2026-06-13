package streams;

public class Employee {

	private String name;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
