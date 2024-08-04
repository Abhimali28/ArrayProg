package PracticeJava;
import java.util.*;
public class matrix_two_array {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];
int b[][]=new int [2][2];
System.out.println("enter first matrix");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		a[i][j]=sc.nextInt();	
	}
}
System.out.println("enter second matrix");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		b[i][j]=sc.nextInt();
		
	}
}
System.out.println("print first matrix");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(a[i][j]+" ");
		
	}
System.out.println();	
}
System.out.println("print second matrix");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
System.out.println("Addition of A and B Two matrix");
int c[][ ]=new int [2][2];
 for(int i=0;i<2;i++)
 {
	 for(int j=0;j<2;j++)
	 {
		 c[i][j]=a[i][j]+b[i][j];
		 System.out.print(c[i][j]+" ");
	 }
	 System.out.println();
 }

}}                 