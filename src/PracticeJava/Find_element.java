package PracticeJava;
import java.util.Scanner;
public class Find_element {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter size of array");
  int a[]=new int[sc.nextInt()];
  System.out.println("enter elements");
  for(int i=0;i<a.length;i++)
  {
	  a[i]=sc.nextInt();
  }
  System.out.println("enter choice elements");
  int search=(sc.nextInt());
 
  for(int i=0;i<a.length;i++)
  {
	  if(a[i]==search)
	  {
		  
		  System.out.println("this digit present");
		  return;
	  }
  }
  System.out.println("this digit Absent");
}}