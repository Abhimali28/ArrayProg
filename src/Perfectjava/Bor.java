package Perfectjava;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.*;
import java.util.Set;
public class Bor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int [][]a=new int [2][2];
	int[][]b=new int[2][2];
int[][]c=new int [2][2];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();		
		}
	}
	System.out.println("enter elements B matrix");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			b[i][j]=sc.nextInt();
		}
		System.out.println();
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
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(b[i][j]+" ");
}
		System.out.println();
		}
      System.out.println("Addition of Two numbers");
     for(int i=0;i<c.length;i++)
     {
    	 for(int j=0;j<c.length;j++)
    	 {
    		 c[i][j]=a[i][j]+b[i][j];
    		 System.out.print(c[i][j]+" ");
    	 }
    	 System.out.println();
     }
}}