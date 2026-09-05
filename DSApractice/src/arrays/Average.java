package arrays;

public class Average {

	public static void main(String[] args) {
		
		int arr[]= {5,7,3,9};
		
		int length = arr.length;
		
		double sum =0;
		double avg =0;
		
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
			
			avg = sum/length;
		}
		System.out.println(avg);

	}

}
