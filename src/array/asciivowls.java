package array;
import java.util.Scanner;
public class asciivowls {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter size");
	int a=sc.nextInt();
	char[] a1=new char[a];
	System.out.println("enter elements");
	for(char i=0;i<a1.length;i++)
	{
		a1[i]=sc.next().charAt(0);
	} 
	for(char i=0;i<a1.length;i++)
	{
		if(a1[i]=='a'||a1[i]=='e'||a1[i]=='i'||a1[i]=='o'||a1[i]=='u')
   	 {
			System.out.println((int)a1[i]);
   	 }
			else {
			System.out.println(" this vowles not present");	
			}
		}
	
	}
}