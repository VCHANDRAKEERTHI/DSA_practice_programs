package search;

public class UnsortedBinary {

	public static void main(String[] args) {
		
		int arr[] = {5,4,2,7,1,8};
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					continue;
				}else if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
				}
			}
		}
	}

}
