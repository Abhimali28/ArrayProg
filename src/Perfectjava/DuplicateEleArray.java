package Perfectjava;

public class DuplicateEleArray {
public static void main(String[] args) {
	int []a=new int[] {1,20,4,43,34,34,3,4,2,30};
	System.out.println("duplicate elements in array");
	for (int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
		}
		
	}
	
}
}
