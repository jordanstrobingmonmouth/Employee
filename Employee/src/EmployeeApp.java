
public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		
		list.insert(new Employee(101, 50100));
		list.insert(new Employee(103, 55200));
		list.insert(new Employee(111, 51500));
		list.insert(new Employee(131, 54320));
		list.insert(new Employee(102, 48000));

	
		System.out.println("Before Raise for Employee 131: ");
		list.display();
		
		list.raiseSalary(131, 0.05);
		
		System.out.println();
		
		System.out.println("After Raise for Employee 131: ");
		list.display();
	}

}
