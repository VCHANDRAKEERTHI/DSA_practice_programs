package search;

public class FirstOccur {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int target = 5;
		int ans =-1;
		int left = 0;
		int right=arr.length-1;
		
		while(left<=right) 
		{
		int middle = (left+right)/2;
		
		if(arr[middle] == target) {
			ans = middle;
			right = middle-1;
		}
		else if(arr[middle]<target) {
			left=middle+1;
			
		}
		else {
			
			right =middle-1;
		}
		
		}
		
	}
}