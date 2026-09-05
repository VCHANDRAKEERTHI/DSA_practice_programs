package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		int arr[] = {3,2,6,8,9};
		int sum =0;
		
		for(int i =0;i<arr.length;i++) {
			sum +=arr[i];
		}

		System.out.println(sum);
	}

}
