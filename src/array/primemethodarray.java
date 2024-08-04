package array;
import java.util.Scanner;
public class primemethodarray {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size array");
	int a=sc.nextInt();
	int a1[]=new int[a];
	System.out.println("enter array no");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
		
	}
	for(int i=0;i<a1.length;i++)
	{
		isprime(a1[i]);
	}
}
public static void isprime(int a)
{
	int count=0;
	for(int i=0;i<=a;i++)
	{
		if(a%i==0)
			count++;
	}
	if(count==2)
	
		System.out.println("prime no="+a);
	
}
}
