package Perfectjava;
import java.util.*;
public class MxMnNo {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max>a[i])
		{
			max=a[i];
		}
		else if(min<a[i])
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}