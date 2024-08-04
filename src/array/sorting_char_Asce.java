package array;
import java.util.Scanner;
public class sorting_char_Asce {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the size of array");
	char []a=new char[sc.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])
				{
			char temp = a[i];
			a[i]=a[j];
			a[j]= temp;
				}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
