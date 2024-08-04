package array;
import java.util.Scanner;
public class two_d_prime {
public static void main(String[] args) {
	System.out.println("enter data");
Scanner sc=new Scanner(System.in);
int [][]a1=new int[3][3];
for(int i=0;i<a1.length;i++)
{
	for(int j=0;j<a1[i].length;j++)
	{
		a1[i][j]=sc.nextInt();
	}
}
for(int i=0;i<a1.length;i++)
{
	for(int j=0;j<a1[i].length;j++)
	{
		m1(a1[i][j]);
	}
}
}

public static void m1(int a)
{
	int c=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		
			c++;
		
	}
	if(c==2)
		System.out.println("prime no"+a);
}}