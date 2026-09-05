package arrays;

public class arraydeclaration {

	public static void main(String[] args) {
		int[] arr1;//declaration
		int[] arr2 = new int[5];//initialiazation
		int[] arr3 = {3,5,6,7,8};//
		
		
		//System.out.println(arr1);
		
		for(int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		//traversing an array
		for(int i =0;i<arr3.length;i++) {
			System.out.print(arr3[i]);
		}
		
	}

}
