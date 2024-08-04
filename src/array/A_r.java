package array;
import java.util.Scanner;
public class A_r {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter elements");
	for(int i=0;i<=a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<=a.length;i++)
	{
		
			for(int j=0;j<=a.length;j++)
			{
			if(a[i]<=a[j])
					{
				       count++;
					}
			}
			System.out.println(count);
		}
	//System.out.println(count);
	}
	

}
