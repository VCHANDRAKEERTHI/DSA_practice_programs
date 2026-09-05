package arrayList;

import java.util.ArrayList;
import java.util.List;


class Employee{
	int empID;
	String empName;
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "[empID: " + empID + ", empName: " + empName + "]";
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> e1 = new ArrayList<>();
		
		e1.add(new Employee(121,"bahu"));
		e1.add(new Employee(123,"bali"));
		e1.add(new Employee(124,"deva"));
		for(Employee e:e1)
		{
			System.out.println(e);
		}
	}

}
