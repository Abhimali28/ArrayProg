package Perfectjava;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class Repete {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of Array");
	int a[][]=new int[sc.nextInt()][sc.nextInt()];
	for(int i=0;i<a.length;i++)
	{ 
		for(int j=0;j<a.length;j++)
		{
		a[i][j]=sc.nextInt();
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
	}
}