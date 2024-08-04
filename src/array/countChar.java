package array;

import java.util.Scanner;

public class countChar {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int a=sc.nextInt();
	char a1[]=new char[a];
	System.out.println("enter elements");
	for(char i=0;i<a1.length;i++)
	{
		a1[i]=sc.next().charAt(0);
	
	}int count =0;
	for(char i=0;i<a1.length;i++)
	{
		if(a1[i]!=0)
		{
			for(char j=(char)(i+1);j<a1.length;j++)
			{
				if(a1[i]==a1[j])
				{
					
					count++;
				}
			}
		}
	}
	System.out.println(count);
}
}
