package Loops;
import java.util.Scanner;
//public class Digits {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int largest=0;
//		int num = 0;
//		while(n>0) {
//			num = n%10;
//			
//			if(num>largest) {
//				largest = num;
//			}
//			n/=10;
//			
//		}
//		System.out.println(largest);
//	}
//
//}
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int small=9;
		int num = 0;
		while(n>0) {
			num = n%10;
			
			if(num<small) {
				small = num;
			}
			n/=10;
			
		}
		System.out.println(small);
	}

}



