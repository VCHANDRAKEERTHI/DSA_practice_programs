package arrays;

public class addElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5};
		int size = arr.length;
		int pos = 2;
		int value=3;
		
		//new array
		int arr1[] = new int[size+1];
		
		for(int i =0;i<pos;i++) {
			
				arr1[i]=arr[i];
			//assigning value at the position
				
			arr1[pos]=value;
		}
		
		
		for(int i=pos;i<arr.length;i++) {
			arr1[i+1]=arr[i];
		}
		
		
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
