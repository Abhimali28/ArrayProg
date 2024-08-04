package array;

import java.util.Scanner;

public class elementpresent_or_not{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");   
	
	String a1[]=new String[sc.nextInt()];       
	for(int i=0;i<a1.length;i++)     
	{
		System.out.println("enter data to ");
		a1[i]=sc.next();
	}
	System.out.println("enter data to cheak");
	String search=sc.next();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i].equals(search))
			{
				System.out.println("present");
				return;
			}
		}
		System.out.println("absent");	
}
}