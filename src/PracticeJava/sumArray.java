package PracticeJava;
import java.util.Scanner;
public class sumArray {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the size");
	int[]a=new int[sc.nextInt()];
	int sum=0;
	System.out.println("enter elements");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for (int i=0;i<a.length;i++)
	{
		sum=a[i]+sum;
		
	}
	System.out.println(sum);
}
}
