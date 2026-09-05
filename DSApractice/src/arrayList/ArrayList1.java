package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		al.add("keerthi");
		al.add("teja");
		al.add(null);
		al.add("89");
		System.out.println(al);
		
		
		Iterator<String> l1 = al.iterator();
		while(l1.hasNext()) {
			System.out.println(al);
			break;
			
		}
		
		

	}

}
