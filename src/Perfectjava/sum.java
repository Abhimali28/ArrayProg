package Perfectjava;
import java.util.Scanner;
public class sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	int sum=0;
	while(a>0)
	{
		int temp=a%10;
		sum=sum+temp;
		
		a=a/10;
	}
	System.out.println(sum);
	
	
}
}
