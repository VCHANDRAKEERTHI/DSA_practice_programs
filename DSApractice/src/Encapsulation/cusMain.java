package Encapsulation;

public record cusMain() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("keerthi",40);
		System.out.println(c.age()+" "+c.name());
		
	}

}
