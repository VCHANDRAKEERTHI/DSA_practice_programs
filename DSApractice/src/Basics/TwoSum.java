package Basics;

//public class TwoSum {
//
//	public static void main(String[] args) {
//		
//		
//		int arr[] = {1,2,3,4,6};
//		int target =6;
//		
//		for(int i = 0;i<arr.length;i++) {
//			
//		
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					continue;
//				}else if(arr[i]+arr[j]==target) {
//					
//					System.out.println("pairs : "+arr[i]+" "+arr[j]);
//				}
//			}
//		
//		}
//		}
//
//}

public class TwoSum{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,9,10,11};
		int target =14;
		int left =arr[0];
		int right = arr.length-1;
		int sum =0;
		while(left<right) {
			sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("found pairs: "+arr[left]+" "+arr[right]);
				left++;
				right--;
			}else if(sum>target) {
				right--;
			}else {
				left++;
			}
	}
}
}