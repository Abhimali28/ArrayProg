package PracticeJava;
import java.util.Scanner;
public class perfectNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter data");
	int a=sc.nextInt();
	int sum=0;
	for(int i=1;i<a;i++)
	{
		if(a%i==0)
		{
	        sum=sum+i;
		}}
		if(sum==a)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
}
}
