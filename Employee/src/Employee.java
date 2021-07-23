
public class Employee {

	private int employeeID;
	private double salary;
	
	Employee(int id, int s) {
		employeeID = id;
		salary = s;
	}
	
	public int getID() {
		return employeeID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double percent) {
		salary = salary + (salary * percent);
	}
	
	public void display() {
		System.out.println("Employee " + employeeID + "'s salary: $" + salary);
	}
	
}
