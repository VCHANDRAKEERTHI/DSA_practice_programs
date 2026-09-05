package ThisSuper;

public class Employee {

	public void getsalary(int salary) {
		 salary = 45000;
		System.out.println("salary : "+salary);
	}
	public void salary() {
		int salary = 20000;
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.salary();
		em.getsalary(7000);
	}
}
