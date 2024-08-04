package array;
import java.util.Scanner;
public class array2 {
public static void main(String[]args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int[]a1=new int[sc.nextInt()];
	for(int i=0;i<a1.length;i++)
	{
		
		a1[i]=sc.nextInt();
	}
	System.out.print("[");
	for(int i=0;i<a1.length;i++)
	{
		System.out.print(a1[i]+" ");
	}
	System.out.print("]");
}}