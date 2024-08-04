package array;
import java.util.Scanner;
public class oddevensum {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
			System.out.println("enter array size");
	        int a=sc.nextInt();
	        int a1[]=new int[a];
	        System.out.println("enter array element");
	        for(int i=0;i<a1.length;i++)
	        {
	        	a1[i]=sc.nextInt();
	        	
	        }int sum=0;
	        int s=0;
	        for(int i=0;i<a1.length;i++)
	        {
	        	if(a1[i]%2==0)
	        	{
	        		sum=sum+a1[i];
	        		
	        	}
	        	if(a1[i]%2==1)
	        	{
	        		s=s+a1[i];
	        	}
	        }
	        System.out.println("sum of even"+sum);
	        System.out.println("sum of odd"+s);
	        
}
}
