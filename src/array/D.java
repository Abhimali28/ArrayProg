package array;
import java.util.*;
public class D {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int [][]a=new int [sc.nextInt()][sc.nextInt()];
int [][]b=new int [sc.nextInt()][sc.nextInt()];
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a.length;j++)
	 {
		 a[i][j]=sc.nextInt();
	 }
 }
 for(int i=0;i<b.length;i++)
 {
	 for(int j=0;j<b.length;j++)
	 {
		 b[i][j]=sc.nextInt();
	 }
 }
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a.length;j++)
	 {
		 System.out.print(a[i][j]+" ");
	 }
	 System.out.println();
 }
 for(int i=0;i<b.length;i++)
 {
	 for(int j=0;j<b.length;j++)
	 {
		 System.out.print(b[i][j]);
	 }
	 System.out.println();
 }
int c[][]=new int[sc.nextInt()][sc.nextInt()];
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c.length;j++)
	{
		c[i][j]=a[i][j]+b[i][j]; 
		System.out.print(c[i][j]); 
	}
	System.out.println();	
}
}
}
