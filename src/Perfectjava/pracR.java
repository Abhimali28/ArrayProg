package Perfectjava;
import java.util.*;
public class pracR {
public static void main(String[] args) {
	System.out.println("enter data");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
			int rev=0;
			int sum=0;
			while(a!=0)   
			{	
			int rem=a%10;
			rev=(rev*10)+rem;
			sum=sum+rem; 
		  a=a/10;
			}
			System.out.println(rev);
}
}