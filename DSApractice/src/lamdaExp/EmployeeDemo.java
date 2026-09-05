package lamdaExp;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	int empid;
	String empname;
	
	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname=empname;
		}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(123,"sathya"));
		al.add(new Employee(124,"keerthi"));
		al.add(new Employee(125,"teja"));
		al.add(new Employee(126,"chandhu"));
		System.out.println(al);

		
		Collections.sort(al,(e1,e2) -> (e1.empid>e2.empid)?-1:(e1.empid<e2.empid)?1:0);
		System.out.println(al);
		
		Collections.sort(al,(e1,e2) -> (e1.empid>e2.empid)?1:(e1.empid<e2.empid)?-1:0);
		System.out.println(al);
	}

}
