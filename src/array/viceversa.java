package array;

import java.util.Scanner;
public class viceversa {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a=sc.nextInt();
	int a1[]=new int[a];
	System.out.println("enter no");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
		
	}
	for(int i=a1.length-1;i>=0;i--)
	{
		if(a1[i]%2==0)
		{
	System.out.println(a1[i]);	
		}
	
}
}}
