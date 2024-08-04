package array;
import java.util.Scanner;
public class fres {
public static void main(String[] args) {
	System.out.println("enter size of array");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	int a1[]=new int [sc.nextInt()];

	for(int i=0;i<a1.length;i++)
	{
		 a1[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<a1.length;i++)
		
	{
		if(a1[i]%2==0)
		{
			//count=count+a1[i];
			count++;
			//System.out.println(count);
		}}
		System.out.println(count);
	//}
	
	
	
	
	
	
	
					
}
}
