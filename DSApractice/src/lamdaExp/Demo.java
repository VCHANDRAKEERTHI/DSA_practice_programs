package lamdaExp;

@FunctionalInterface
interface Calculator{
	public int add(int a, int b);
}
public class Demo {
	
	public static void main(String[] args) {
//		Calculator c = new Calculator() {
//			@Override
//			public int add(int a ,int b) {
//				return a+b;
//			}
//		};
//		System.out.println(c.add(12, 98));
		
		
		Calculator c = (a,b)->{return a+b;};
		System.out.println(c.add(10, 89));
		
		
		
	}
	
	

}
