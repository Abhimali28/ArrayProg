package PracticeJava;
import java.util.*;
public class CountWorld {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String elements");
	String s=sc.nextLine();
	int count=1;
	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
		{
			count++;
		}		
	}
	System.out.println("number of world in String"+" "+count);
}
}