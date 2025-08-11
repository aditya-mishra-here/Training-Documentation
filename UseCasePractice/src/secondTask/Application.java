package secondTask;

public class Application {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("1", "Aditya", 10000);
		emp1.displayEmployeeDetails();
		
		
		emp1.setSalary(-1);
		emp1.displayEmployeeDetails();
		
//		Employee emp2 = new Employee("2", "Aryan", 20000);
//		
//		Employee emp3 = new Employee("3", "Vedant", -30000);
		
//		emp2.displayEmployeeDetails();
//		emp3.displayEmployeeDetails();
		
		

	}

}
