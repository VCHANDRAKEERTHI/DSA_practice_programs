package arrays;

public class MinElement {

	public static void main(String[] args) {


		int arr[] = {97,7,5,9,12,89};
		
		int minele=arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]< minele) {
				minele = arr[i];
			}
			
		}
		System.out.println(minele);

	}

}
