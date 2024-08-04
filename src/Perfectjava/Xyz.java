package Perfectjava;
import java.util.*;
public class Xyz {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the Number");
 int []a=new int[sc.nextInt()];
 for(int i=0;i<a.length;i++)
 {
	 a[i]=sc.nextInt();
 }
 System.out.println("enter search elements");
 int search=sc.nextInt();
 for(int i=0;i<a.length;i++)
 {
	 if(a[i]==search)
	 {
		 System.out.println("present");
		 return;
	 }
				 
 }
		 System.out.println("Absent");
	 }
	
 
 
}

