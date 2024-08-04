package PracticeJava;
import java.util.*;
public class practice {
public static void main(String[] args) {
	System.out.println("enetr size2");
	Scanner s=new Scanner(System.in);
	int a[]=new int[s.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}
		//System.out.println(a[i]);
	}
	
}
}
