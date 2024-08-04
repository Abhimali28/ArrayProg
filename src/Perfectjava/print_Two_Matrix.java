package Perfectjava;
import java.util.*;
public class print_Two_Matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int a[][]=new int[2][2];
	int b[][]=new int [2][2];
	System.out.println("enter A array elements");
	for(int i=0;i<a.length;i++)
	 {
		for(int j=0;j<a.length;j++)
		{
		a[i][j]=sc.nextInt();   
		 }
		}
	System.out.println("Entre B Aarray elements");
	for(int i=0;i<b.length;i++)
	{
		 for(int j=0;j<b.length;j++)
		 {
			 b[i][j]=sc.nextInt();		 
		 }
	}
	System.out.println("print A matrix");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("print B matrix");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
}