package PracticeJava;
import java.util.*;
public class cW {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String data");
	String a=sc.nextLine();
	int count=1;
	for(int i=0;i<a.length();i++)	
	{
		if(a.charAt(i)==' '&&(a.charAt(i+1)!= ' '))
		{
			count++;
		}
	}
	System.out.println(count);
}
}
