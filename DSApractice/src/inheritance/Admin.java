package inheritance;

 class guest {
	
	 void read() {
		 System.out.println("read application");
	 }
}
 
 class developer extends guest{
	 void develop() {
		 System.out.println("developer developing................");
	 }
 }
public class Admin extends developer {

	void haverights() {
		System.out.println("all rights");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admin ad = new Admin();
		ad.read();
		ad.develop();
		ad.haverights();
	}

}
