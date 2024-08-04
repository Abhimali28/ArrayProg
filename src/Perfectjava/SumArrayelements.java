package Perfectjava;
import java.util.*;
public class SumArrayelements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size array");
	int[]a=new int[sc.nextInt()];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int sum=0;         
	for(int i=0;i<a.length;i++)                    
	{
		sum =sum+a[i];
	}
	System.out.println(sum);
}
}