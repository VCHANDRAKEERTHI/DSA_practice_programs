package arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		
		int arr[] = {2,5,6,7,8};
		int arr1[]= new int[arr.length-1];
		int pos = 3;
		
		for(int i =0;i<pos;i++) {
			arr1[i]=arr[i];
			
		}

		for(int i =pos;i<arr.length-1;i++) {
			arr1[i]=arr[i+1];
		}
		
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
