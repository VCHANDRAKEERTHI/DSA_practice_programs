package arrays;

public class MaxElement {

	public static void main(String[] args) {


		int arr[] = {97,7,5,9,12,89};
		
		int maxele=arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]> maxele) {
				maxele = arr[i];
			}
			
		}
		System.out.println(maxele);

	}

}
