package Perfectjava;
import java.util.*;
public class Min_Max_NoArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of Array");
	int a[]=new int [sc.nextInt()];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max =a[0];
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
	System.out.print(min+"is a min no ");
	System.out.print(max+" is a max no");
}
}