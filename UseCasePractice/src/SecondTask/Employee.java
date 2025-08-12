package SecondTask;

public class Employee {
	String employeeId;
	String name;
	double salary;
	
	public Employee(String employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary cannot be negative");
			this.salary = 0;
		}
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name of employee : " + name + ", Employee Id is : "+ employeeId + ", Salary is : " + salary);
	}
	
	
}
