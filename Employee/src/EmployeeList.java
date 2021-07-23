import java.util.LinkedList;

public class EmployeeList {

	LinkedList<Employee> elist;
	
	EmployeeList() {
		elist = new LinkedList<>();
	}
	
	public void insert(Employee e) {
		elist.add(e);
	}
	
	public void raiseSalary(int id, double percent) {
		
		for(int i = 0; i < elist.size(); i++) {
			if (id == elist.get(i).getID()) {
				elist.get(i).raiseSalary(percent);
			}
		}
	}
	
	public void display() {
		for(int i = 0; i < elist.size(); i++) {
			elist.get(i).display();
		}
	}
	
}
