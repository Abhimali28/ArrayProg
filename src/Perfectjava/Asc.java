package Perfectjava;
import java.util.*;
public class Asc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size data");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter data");
   for(int i=0;i<a.length;i++)
   {
	   a[i]=sc.nextInt();
   }
   for(int i=0;i<a.length;i++)
   {
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[i]<a[j])
		   {
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
	   }
   }
   for(int i=0;i<a.length;i++)
   {
   System.out.print(a[i]);
}
System.out.println();   
}
}
