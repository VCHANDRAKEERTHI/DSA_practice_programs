package arrays;

public class UpdateElement {

	public static void main(String[] args) {
		int arr[] = {5,6,8,4};
		
		int pos =2;
		int value =9;

		for(int i =0;i<arr.length;i++) {
			if(arr[i]==arr[pos]) {
				arr[pos]=value;
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
