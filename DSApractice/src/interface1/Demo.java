package interface1;
interface A{
	void m1();
	default void sleeping() {
	System.out.println("A sleeping..............");
	}
	static void companyName(){
		System.out.println("ABC");
	}
}
interface B{
	default void sleeping() {
		System.out.println("B sleeping..............");
		}
}
public class Demo implements A,B{
	@Override
	public void m1() {
		System.out.println("hiii");
	}
	@Override
	public void sleeping() {
		A.super.sleeping();
		B.super.sleeping();
		System.out.println("not sleeping.............");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		//d.m1();
		//d.sleeping();
		A.companyName();	
	}
}