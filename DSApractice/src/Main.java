
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"keerthi");
		Employee e2= new Employee(2,"teja");
		Employee e3 = new Employee(3,"me");
		Employee e4= new Employee(4,"you");
		
		Employee emps[] = {e1,e2,e3,e4};
		for(Employee e : emps) {
			System.out.println(e);
		}

	}

}
