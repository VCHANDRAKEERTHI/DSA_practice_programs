package inheritance;

class vehicle{
	void start() {
		System.out.println("vechicle started...............");
	}
}

class Engine{
	void strike() {
		System.out.println("engine started..............");
	}
}
public class Car extends vehicle{

	void bmw() {
		System.out.println("car started...........");
	}
	public static void main(String[] args) {
		Car car = new Car();
		Engine en = new Engine();
		car.start();
		car.bmw();
		en.strike();
		

	}

}
