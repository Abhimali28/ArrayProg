package PracticeJava;
import java.util.Scanner;
public class Transpose_Matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][2];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("print elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Transform matrix  elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	
	
}
}
