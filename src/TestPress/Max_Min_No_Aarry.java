package TestPress;
import java.util.*;
public class Max_Min_No_Aarry {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of Array");
	int a[]=new int [sc.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
			if(a[i]>max  )	
			{
				max=a[i];
			}
				else if(a[i]<min)
				{
					min=a[i];
				}
	}		
	System.out.println(max );
	System.out.println(min);
	
}
}
