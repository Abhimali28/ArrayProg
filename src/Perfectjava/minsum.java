package Perfectjava;
import java.util.*;
public class minsum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of matrix");
	int[] []a=new int[sc.nextInt()][sc.nextInt()];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)    
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");			
			}
			System.out.println();
		 }
		int min=a[0][0];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{		for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					sum=a[i][j]+min;			  
				}	
	
				//System.out.print(sum+" ");
			}	
		System.out.println(sum);
		}
	}
}