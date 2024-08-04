
package array;

import java.util.Scanner;

public class ex {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a1[]=new int[sc.nextInt()];
	System.out.println("enter element");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
		
	}int count=0;
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]!=0)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]==a1[j])
				{
					count++;
					
				}
			}
		}
	}
	System.out.println(count);
}}