package Perfectjava;
import java.util.Scanner;
import java.util.*;
public class FE {
public static void main(String[] args) {
	System.out.println("enter array");
	Scanner sc=new Scanner(System.in);
	int a[]=new int[sc.nextInt()];
	System.out.println("enter arayy");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("find elements");
	int ab=sc.nextInt();
	
	for(int i=0;i<a.length;i++)
	{
		 if(a[i]==ab)
		 {
			 System.out.println("present");
		 }
		 else
		 {
			 System.out.println("absent");
		 }
	}
}
}