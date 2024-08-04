package array;
import java.util.Scanner;
public class find_index {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
		
	{
		a[i]=sc.nextInt(); 
	}
	System.out.println("choice elements");
	int search=sc.nextInt();  
	for(int j=0;j<a.length;j++)
	{
		if(a[j]== search)
		{
			System.out.println("present");
			return;
		}
	}
	System.out.println("absent");
}
}
