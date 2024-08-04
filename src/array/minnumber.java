package array;

import java.util.Scanner;

public class minnumber {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int a=sc.nextInt();
	int a1[]=new int [a];
	System.out.println("enter elements");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}int min=a1[0];
	for(int i=0;i<a1.length;i++)
	{
		if(min>a1[i])
		{
			min=a1[i];
		}
	}
	System.out.println(min+" "+"this is smallest number");
}
}



