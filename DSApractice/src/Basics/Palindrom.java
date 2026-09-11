package Basics;

public class Palindrom {

	public static void main(String[] args) {
		
		String s= "levokel";
		
		char ch[] = s.toCharArray();
		
		int left=0;
		int right = ch.length-1;
		while(left<right) {
			//System.out.println("hi");
		if(ch[left] == ch[right]) 
		{
			//System.out.println("hi");
			//System.out.println(ch[left]+" "+ch[right]);
			left++;
			right--;
		}
		else 
		{
			System.out.println("not palindrome");
		}
		}
		//System.out.println(ch[right]);
		

	}

}
