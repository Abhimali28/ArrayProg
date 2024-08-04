package array;
import java.util.Scanner;
public class checkelement_int_type {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
	int a1[]=new int[sc.nextInt()];
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	System.out.println("enter data to cheak");
	int search=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==search)
			{
				System.out.println("present");
				return;		
			}
		}
		System.out.println("absent");	
}
}
