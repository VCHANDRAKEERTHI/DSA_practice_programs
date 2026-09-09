package search;

public class FirstEvenNum {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,4,6,5,7,8};

		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" even");
				break;
			}else {
				continue;
				
			}
		}

	}

}
