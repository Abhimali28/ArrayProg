package array;

import java.util.Scanner;

public class printvowels {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int a=sc.nextInt();
	char a1[]=new char[a];
     System.out.println("enter no");
     for(char i=0;i<a1.length;i++)
     {
    	 a1[i]=sc.next().charAt(0);
    	 
     }
     for(char i=0;i<a1.length;i++)
     {
    	 if(a1[i]=='a'||a1[i]=='e'||a1[i]=='i'||a1[i]=='o'||a1[i]=='u')
    	 {
     System.out.println(a1[i]);
}}
}}
