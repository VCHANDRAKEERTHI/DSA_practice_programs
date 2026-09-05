package arrays;

public class Majority {

	public static void main(String[] args) {
		int[] arr = {2,5,4,1,3,3,3,3,2,3,4};
		
		int size = arr.length/2;
		int majority=-1;
		for(int i =0;i<arr.length;i++) {
			int count1 = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count1++;
				}
			}
			if(count1 > size) {
				majority=arr[i];
				
			}
			
		}
		System.out.println(majority);

	}

}
