package Perfectjava;
import java.util.*;
public class B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int [][]a=new int [sc.nextInt()][sc.nextInt()];
	int [][]b=new int[sc.nextInt()][sc.nextInt()];
	//int [][]c=new int [sc.nextInt()][sc.nextInt()];
	System.out.println("enter A elements");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter B element");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("print a matrix");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("print b matrix");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	int [][]c=new int [sc.nextInt()][sc.nextInt()];
System.out.println("Addition of two matrix");
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c.length;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
}
}