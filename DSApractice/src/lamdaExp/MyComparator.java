package lamdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator {

//	@Override
//	public int compare(Integer p, Integer q) {
//		if(p<q) {
//			return -1;
//		}else if(p<q) {
//			return 1;
//		}else {
//			return 0;
//		}
//		
//	}

	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		al.add(71);
		al.add(56);
		al.add(45);
		al.add(23);
		
		System.out.println(al);
		
//		Collections.sort(al, new MyComparator());
		
		Comparator<Integer> c= (p,q)->(p<q)?1:(p>q)?-1:0;
		System.out.println(al);
	}


	
}
