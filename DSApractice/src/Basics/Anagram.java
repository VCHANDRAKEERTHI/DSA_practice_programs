package Basics;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "hey";
		String s2 = "yieh";
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		//System.out.println(a+" "+b);
		if(Arrays.equals(b, a)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

	}

}
