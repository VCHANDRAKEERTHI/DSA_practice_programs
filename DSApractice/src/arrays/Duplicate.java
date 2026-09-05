package arrays;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,3,4,5,5};
		boolean count=false;
		for(int i =0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate found : "+arr[i]);
					count = true;
					break;
				}
			}
			if(count) {
				
				break;
			}
			
		}
		if(!count) {
			System.out.println("no duplicates");
		}

	}

}
