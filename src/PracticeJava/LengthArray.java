package PracticeJava;
import java.util.*;
public class LengthArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int []a=new int[sc.nextInt()];
	System.out.println("enter elemets");
	for(int i=0;i<a.length;i++)
	{
		  a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("length of Array"+a.length);
}
}