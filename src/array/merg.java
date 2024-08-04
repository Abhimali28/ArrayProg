package array;
import java.util.*;
public class merg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of A matrix");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter size of B matrix");
	int b[]=new int[sc.nextInt()];
	System.out.println("enter A matrix");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enter the b matrix");
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
		}
	int index=0;
	int c[]=new int[a.length +b.length];
	for(int i=0;i<a.length;i++)
	{
		c[index++]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
	  c[index++]=b[i];
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}	
}
}
