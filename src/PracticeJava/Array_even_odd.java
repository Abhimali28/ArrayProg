package PracticeJava;
import java.util.*;
public class Array_even_odd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int []a=new int[sc.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int sum=0;
	//int s=0;
	
	for(int i=0;i<a.length;i++)
	{
	 	if(a[i]%2==0)
		{
			System.out.println(a[i]);
			//sum=a[i]+sum;
		}
		if(a[i]%2==1)
		{
		//	System.out.println(a[i]);
			//s=s+a[i];
		}
}
	System.out.println("sum of even"+sum);
	//System.out.println("sum of odd"+s);
}
}