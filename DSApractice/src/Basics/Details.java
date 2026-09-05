package Basics;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
int id = 0;
String name="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		if(sc.hasNextInt())
		{
		 id = sc.nextInt();
		}
		else {
			System.out.println("invalid");
		}
		
		
		System.out.println("Enter name : ");
		 name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter full name : ");
		String Full_name = sc.nextLine();
		
		System.out.println("Enter marital status : ");
		boolean marital_status = sc.nextBoolean();	
		
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter address : ");
		String Address = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter atm_pin : ");
		int atm_pin = sc.nextInt();
		
		System.out.println("Enter annual salary : ");
		double Annual_salary = sc.nextDouble();
		
		System.out.println("Enter increment : ");
		int increment = sc.nextInt();
		
		System.out.println("Enter height : ");
		float height = sc.nextFloat();
		
		System.out.println("Enter phn number : ");
		long phnnumber = sc.nextLong();
		
		System.out.println("Enter aadhar number : ");
		long aadharNumber = sc.nextLong();
		
		System.out.println("Enter p or ab : ");
		boolean PresentOrAbsent = sc.nextBoolean();
		
		
		
		System.out.println("ID"+id);
		System.out.println("name"+name);
		System.out.println("Full_name"+Full_name);
		System.out.println("marital_status"+marital_status);
		System.out.println("salary"+salary);
		System.out.println("Address"+Address);
		System.out.println("atm_pin"+atm_pin);
		System.out.println("Annual_salary"+Annual_salary);
		System.out.println("increment"+increment);
		System.out.println("height"+height);
		System.out.println("phnnumber"+phnnumber);
		System.out.println("aadharNumber"+aadharNumber);
		System.out.println("PresentOrAbsent"+PresentOrAbsent);
		
	}

}
