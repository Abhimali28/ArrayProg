package Perfectjava;
import java.util.*;
public class OE {
public static void main(String[] args) {
	System.out.println("enter elements");
	Scanner sc=new Scanner(System.in);
	int s=1;
	int count =0;
	int a=sc.nextInt();
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
		System.out.println("it is  prime no"+a);
	}
	else
	{
		System.out.println("it is not prime no"+a);
	}
}
}