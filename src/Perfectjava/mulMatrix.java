package Perfectjava;
import java.util.Scanner;
public class mulMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  A  B size of aaray Matrix");
	int a[][]=new int [sc.nextInt()][sc.nextInt()];
	//System.out.println("enter B size of aaray Matrix");
	int b[][]=new int[sc.nextInt()][sc.nextInt()];
	int c[][]=new int [sc.nextInt()][sc.nextInt()];
	System.out.println("enter A matrix");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();	
		}
	}
	System.out.println("enter B matrix");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("Print A matrix");
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
    // int c[][]=new int [sc.nextInt()][sc.nextInt()];
     System.out.println("Multiplication of A and B Matrix");
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a.length;j++)
    	 {
    		 c[i][j]=a[i][j]*b[i][j];
    			 System.out.print(c[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
}
}