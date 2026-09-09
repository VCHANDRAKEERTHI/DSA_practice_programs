package search;

public class LastOccur {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,2,2,2,2,4,5,7};
		int target = 2;
		
		int ans =-1;
		int left = 0;
		int right=arr.length-1;
		
		while(left<=right) 
		{
		int mid = (left+right)/2;
		
		if(arr[mid] == target) {
			ans = mid;
			left = mid+1;
		}
		else if(arr[mid]<target) {
			left=mid+1;
			
		}
		else {
			
			right =mid-1;
		}
		
		}
		System.out.println("first occur : "+ans);
	}
}