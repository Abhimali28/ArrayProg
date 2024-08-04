package PracticeJava;
import java.util.*;
public class print_Onely_vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	char a[]=new char[sc.nextInt()];
	System.out.println("enter elements");
	for(char i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
			System.out.println(a[i]);
		}
	}
}
}