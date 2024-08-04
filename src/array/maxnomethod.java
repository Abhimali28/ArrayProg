package array;
import java.util.Scanner;

public class maxnomethod {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a=sc.nextInt();
	int a1[]=new int[a];
	System.out.println("enter elements");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	System.out.println(m1(a1));
}
public static int m1(int []a)
{
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
		max=a[i];
		
	}
}
return max;
}}