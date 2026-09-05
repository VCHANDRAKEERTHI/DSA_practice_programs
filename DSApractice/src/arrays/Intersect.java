package arrays;
public class Intersect {
	public static void main(String[] args) {
		int a[] = {1,2,2,4,6};
		int b[] = {2,2,3,4,1};	
		for(int i =0;i<a.length;i++) 
		{	
			boolean alreadydone = false;
			//duplicate check
			for(int k=0;k<i;k++)
			{
				if(a[k]==a[i]) 
				{
					alreadydone = true;
					break;
				}
			}
			if(alreadydone) 
			{
				continue;
			}
			for(int j =0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}	