package Perfectjava;
import java.util.Scanner;   
public class even_odd {  
public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter size of array");  
	int []a=new int[sc.nextInt()];    
	int sum=0;  
	int s=0;   
	for(int i=0;i<a.length;i++)     
	{
		a[i]=sc.nextInt();               
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			sum=sum+a[i];     
		}
		if(a[i]%2==1) 
		{ 
			s=s+a[i]; 
		}
	}
	System.out.println("sum of even no"+sum);  
	System.out.println("sum of odd no"+s);	
}
}