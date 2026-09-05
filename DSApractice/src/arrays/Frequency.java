//package arrays;
//
//public class Frequency {
//
//	public static void main(String[] args) {
//		
//		int arr[] = {2,4,1,2,3,4,4};
//		
//		for(int i = 0;i<arr.length;i++) {
//			int count =0;
//			for(int j =0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			System.out.println(arr[i]+" -->"+count);
//		}
//	}
//
//}
package arrays; 

public class Frequency { 
    public static void main(String[] args) { 
        int arr[] = {2, 4, 1, 2, 3, 4, 4}; 
        int n = arr.length;
        
        boolean visited[] = new boolean[n]; 
        
        for(int i = 0; i < n; i++) { 
            if (visited[i] == true) {
                continue;
            }
            
            int count = 0; 
            for(int j = 0; j < n; j++) { 
                if(arr[i] == arr[j]) { 
                    count++; 
                    visited[j] = true; 
                } 
            } 
            System.out.println(arr[i] + " --> " + count); 
        } 
    } 
}
