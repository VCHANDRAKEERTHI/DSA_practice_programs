package SwitchCase;
import java.util.Scanner;
public class OnlineOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		do {
		System.out.println("1.veg biriyani---170/-");
		System.out.println("2.Pizza---270/-");
		System.out.println("3.chicken biriyani---340/-");
		System.out.println("4.burger---70/-");
		System.out.println("5.exit");
		System.out.println("enter menu");
		
		
		
		switch(menu) {
		case 1->System.out.println("1.veg biriyani==170/- sucefully ordered");
		case 2->System.out.println("2.Pizza---270/- sucefully ordered");
		case 3->System.out.println("3.chicken biriyani---340/- sucefully ordered");
		case 4->System.out.println("4.burger---70/- sucefully ordered");
		case 5->System.out.println("5.exit sucefully ");
		
		}
		}while(menu==5);
	}

}
