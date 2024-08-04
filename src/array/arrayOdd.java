package array;

import java.util.Scanner;

public class arrayOdd {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of aaray");
	int a=sc.nextInt();
	System.out.println("enter no");
	int []a1=new int[a];
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]%2==1)
		{
			System.out.println(a1[i]);
		}
	}
}
}