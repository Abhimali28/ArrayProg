package PracticeJava;
import java.util.Scanner;
public class Merge_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter size A of array");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter size of B Array");
		int b[]=new int[sc.nextInt()];	
		System.out.println("enter elements A");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter B elements");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
	         c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		System.out.print("[");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}}