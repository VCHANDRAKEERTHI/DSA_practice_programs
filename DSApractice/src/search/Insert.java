package search;

public class Insert {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7,9};
		int target = 7;
		int left =0;
		int right=arr.length-1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("found at index : "+i);
				return;
			}else  {
				
				while(left<=right) {
					int mid =(left +right)/2;
					if(arr[mid]<target) {
						left = mid+1;
					}else {
						right=mid-1;
					}
				}
				
			}
			
		}
		System.out.println("positioned at: "+left);

	}
}
