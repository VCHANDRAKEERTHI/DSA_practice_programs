package search;


import java.util.Arrays;
import java.util.List;

public class FindArrayList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("pen","pencil","book","paper");
		
		String target = "book";
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("found String index : "+i);
				return;
			}
		}
		System.out.println("not found");
	}
}