package Perfectjava;
import java.util.Scanner;
public class MxMn {
public static void main(String[] args) {
	System.out.println("enter size of Array");
	Scanner sc=new Scanner(System.in);
	int[] a=new int[sc.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		 else if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("max"+max);
	System.out.println("min"+min);
}
}