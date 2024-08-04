package array;

import java.util.Scanner;

public class firstDulpicate
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a=sc.nextInt();
	int a1[]=new int[a];
	System.out.println("enter element size");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
		
	}
	for(int i=0;i<a1.length;i++)
	{
		if( a1[i]!=0)
		{
			int count=1;
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]==a1[j])
				{
					count++;
					a1[j]=0;
				
				}
			}
			if(count!=1)
			{
				System.out.println(a1[i]);
		}
		}
	}
}}