package TestPress;
import java.util.*;
public class PrimeNO {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter data");
	int a=sc.nextInt();
	int s=1;
	int count=0;
	while(s<=a)
	{
		if(a%s==0) 
		{
			count++;
		}
		s++;
	}
	if(count==2)
	{
		System.out.println("it is prime number"+" "+a);
	}
	else
	{
		System.out.println("it is not prime Number"+" "+a);
	}
}
}
