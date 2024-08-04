package PracticeJava;
import java.util.*;
public class maxNO {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter elements");
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
	System.out.println(max);
}
}