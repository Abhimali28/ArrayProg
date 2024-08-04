package PracticeJava;
import java.util.Scanner;
public class ReveseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int [sc.nextInt()];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
	}
}
