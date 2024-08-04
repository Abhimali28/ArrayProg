package array;
import java.util.*;
public class array3 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
			int size=sc.nextInt();
	int []a1=new int[size];
			System.out.println("enter number");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	for(int i=0;i<a1.length;i++)
	{	
		if(a1[i]%2==0)
		{	
	System.out.println(a1[i]);		
}
}}}