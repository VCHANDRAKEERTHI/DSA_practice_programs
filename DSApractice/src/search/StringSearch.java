package search;

public class StringSearch {

	public static void main(String[] args) {
		
		String names[] = {"keerthi","teja","avanika"};
		String target = "keerthi";
		
		int index = -1;
		
		for(int i =0;i<names.length;i++) {
			if(names[i].equals(target)) {
				
				index=i;
			}
			
			
		}
		System.out.println(index!=-1?"found name at : "+index:"not found");

	}

}
