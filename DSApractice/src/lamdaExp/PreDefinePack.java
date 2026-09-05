package lamdaExp;

import java.util.function.Predicate;

public class PreDefinePack {

	public static void main(String[] args) {
		
		Predicate<Integer>  p = x->x%2==0;
		System.out.println( p.test(10));
		System.out.println(	p.test(29));
		
		
		

	}

}
