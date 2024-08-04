package array;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
public class Rep {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size of Array");
 int[][]a=new int [sc.nextInt()][sc.nextInt()];
 int [][]b=new int [sc.nextInt()][sc.nextInt()];
 System.out.println("enter A elements");
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a.length;j++)
	 {
		 a[i][j]=sc.nextInt();
	 }
 }
 System.out.println("enter B elements");
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a.length;j++)
	 {
		 b[i][j]=sc.nextInt();
	 }
 }
    System.out.println("print A elements");
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a.length;j++)
    	{
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println("print B elements");
    for(int i=0;i<b.length;i++)
    {
    	for(int j=0;j<b.length;j++)
    	{
    		System.out.print(b[i][j]+" ");
    	}
    	System.out.println();
    }
    
}
}
