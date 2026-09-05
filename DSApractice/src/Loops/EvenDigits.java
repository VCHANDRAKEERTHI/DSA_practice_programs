package Loops;

import java.util.Scanner;

//public class EvenDigits {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
////		int even=0;
//		int num = 0;
//		while(n>0) {
//	
//			num = n%10;
//			if(num%2==0) {
//				System.out.print(num+" ");
//			}
//			
//			n/=10;
//			
//		}
////		System.out.println(even);
//}
//
//}


public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int even=0;
		int num = 0;
		while(n>0) {
	
			num = n%10;
			if(num%2!=0) {
				System.out.print(num+" ");
			}
			
			n/=10;
			
		}
//		System.out.println(even);
}

}
