package array;

import java.util.*;

public class X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of A matrix");
		int a[][] = new int[sc.nextInt()][sc.nextInt()];
		System.out.println("enter size of B matrix");
		int b[][] = new int[sc.nextInt()][sc.nextInt()];
		int c[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("enter A matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		System.out.println("enter B Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("print A matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("print B matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of A and B matrix");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+" ");
		}
		System.out.println();	
		}
	}
}
