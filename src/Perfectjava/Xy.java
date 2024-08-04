package Perfectjava;
import java.util.*;
public class Xy {
public static void main(String[] args) {
	System.out.println("enter size of array");
	Scanner sc=new Scanner(System.in);
	int []a=new int [sc.nextInt()];
	System.out.println("enter elements of array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
		  max=a[i];
		}
	}
	System.out.println("it is a maximum no"+max);
}
}