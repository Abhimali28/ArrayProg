package array;
import java.util.Scanner;
public class arrayeven {
	public static void main(String[] args) {
	System.out.println("enter size");
	Scanner sc=new Scanner(System.in);
	int a[]=new int [(sc.nextInt())];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
}}

