package PracticeJava;
import java .util.*;
public class pr {
public static void main(String[] args) {
	System.out.println("enter no");
	Scanner sc=new Scanner(System.in);
	int []a=new int[sc.nextInt()];
	for(int i=0;i<a.length;i++)     
	{
         a[i]=sc.nextInt(); 
	}
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<max)
			
		{
//			int temp=a[i];
//			a[i]=max;
//			max=temp;
			max=a[i];
		}
	}
	System.out.println(max);
}
}
