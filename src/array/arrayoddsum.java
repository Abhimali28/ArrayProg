package array;

import java.util.Scanner;

public class arrayoddsum {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a=sc.nextInt();
	int a1[]=new int[a];
	System.out.println("enter array no");
	for(int i=0;i<a1.length;i++)
	{
		 a1[i]=sc.nextInt();
	}
	int sum=0; 
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]%2==1)
		{
			sum=sum+a1[i];
		}
	}
	System.out.println(sum);
			
}
}
