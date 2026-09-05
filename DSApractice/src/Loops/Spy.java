package Loops;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul=1;
		int sum=0;
		int num = 0;
		int temp = n;
		while(n>0) {
	
			num = n%10;
			mul = mul*num;
			sum = sum + num;
			
			n/=10;
			
		}
		if(mul == sum) {
			System.out.print(temp+ " : spy num");
		}
		else {
			System.out.println(temp + " : not spy num");
		}
	}

}
