package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		Map<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "keerthi");
		hs.put(2, "suresh");
		hs.put(3, "ramesh");
		hs.put(4, "hello");

		
		
		System.out.println(hs);
		
		
		Set<Entry<Integer, String >> st = hs.entrySet();
		Iterator<Entry<Integer, String>> itr = st.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> result = itr.next();
			System.out.println(result.getKey()+" "+result.getValue());
		}
	}

}
