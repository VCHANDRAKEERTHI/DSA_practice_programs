package arrays;

public class RightRotate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int k =2;
		
		for(int r=0;r<k;r++) {
			
			int last = arr[arr.length-1];
			
			for(int i=0;i<arr.length-1;i++) {
				arr[i+1]=arr[i];
			}
			arr[0]=last;
		}

		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
