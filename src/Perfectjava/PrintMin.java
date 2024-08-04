package Perfectjava;
import java.util.*;
public class PrintMin {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter size of aaray");
	int []a=new int [5];
	int min=0;
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>min)
		{
			int temp=a[i];
			a[i]=min;
			min=temp;
		}
	}
	System.out.println(min);
}
}





