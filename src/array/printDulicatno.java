package array;

import java.util.Scanner;

public class printDulicatno {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int a=sc.nextInt();
	    int a1[]=new int[a];
	    System.out.println("enter element");
	    for(int i=0;i<a1.length;i++)
	    {
	    	a1[i]=sc.nextInt();
	    }
	    int count=0;
	    for(int i=a1.length-1;i>=0;i--)
	    {	   	  
	   		  for(int j=i+1;j<a1.length;j++)
	   		  {
	   			  if(a1[i]==a1[j])
	   				  
	   				  
	   			  {
	   				count++;
	   				System.out.println("duplicate no"+a1[i]);
	   				System.out.println("count of no"+count);
	   				
	   			  }
	   			 
	   		  }	  
	   		  
	   		  }
	    }
		}



