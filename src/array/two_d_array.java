package array;
import java.util.Scanner;
public class two_d_array {
public static void main(String[]args)
{
	System.out.println("enter data");
	int[]a1=new int[5];
	int[][]a2=new int[3][3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<a2.length;i++)
	{
		for(int j=0;j<a2[i].length;j++)
		{
			a2[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<a2.length;i++)
	{
		for(int j=0;j<a2[i].length;j++)
		{
			System.out.println(a2[i][j]+" ");
			
		}
		System.out.println();
	}
	
}
}
