package Basics;

//public class Palindrome {
//
//	public static void main(String[] args) {
//
//
//		String s = "keerthi";
//		String rev = "";
//		for(int i =s.length()-1;i>0;i--) {
//			rev = rev+s.charAt(i);
//		}
//		
//		if(s==rev) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
//
//	}
//
//}

public class Palindrome{
	public static void main(String[] args) {
		int num=12332321;
		int temp = num;
		int rev=0;
		while(num>0) {
			int digit = num%10;
			rev = rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
}
