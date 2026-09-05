package ThisSuper;
class Parent{
	public Parent() {
		this.pm();
		System.out.println("parent class constructor..");
	}
	public void pm() {
		System.out.println("parent method");
	}
}
public class Child extends Parent {

	public Child() {
		//super();
		this.pm();
		System.out.println("child class constructor");
	}
	public void pm() {
		System.out.println("child method");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto n-generated method stub
		
		Child c = new Child();
		

	}

}
