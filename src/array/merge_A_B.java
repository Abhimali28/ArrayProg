package array;
import java.util.Scanner;
public class merge_A_B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of A");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter the size of B");
	int b[]=new int[sc.nextInt()];
	System.out.println("enter no in array A");
	for(int i=0;i<a.length;i++)
	{	
		a[i]=sc.nextInt();
	}
	System.out.println("enter no in array B");
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	int c[]=new int[a.length+b.length];
int index=0; 
for(int    i=0;i<a.length;i++)
{
	c[index++]=a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		c[index++]=b[i];
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
	}
	System.out.println();
}
}