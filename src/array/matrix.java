package array;         
import java.util.Scanner;                           
public class matrix {                 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);              
	System.out.println("enter size");           
	int[][] a1=new int[2][2];
	System.out.println("enter elements");
	for(int i=0;i<a1.length;i++)       
	{
	 for(int j=0;j<a1.length;j++)
	 {
		 a1[i][j]=sc.nextInt();
	 }
	}
	for(int i=0;i<a1.length;i++)
	{
	 for(int j=0;j<a1.length;j++)
	 {
	    System.out.print(a1[i][j]+" ");
	 }
	 System.out.println();
	}
	}}