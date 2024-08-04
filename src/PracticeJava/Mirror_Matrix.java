package PracticeJava;
import java.util.*;
public class Mirror_Matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][]a=new int[2][2];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<=1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("print matrix");
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Mirror Matrix");
	for(int i=0;i<=1;i++)
	{
		for(int j=1;j>=0;j--)
		{
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}		
}
}
