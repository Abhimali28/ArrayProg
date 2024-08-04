package PracticeJava;
import java.util.Scanner;
public class Count_Wolrd {  
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter size of Array");
String a=sc.nextLine();   
int count =1;
for(int i=0;i<a.length();i++)
{
	if(a.charAt(i)==' ' && (a.charAt(i+1)!=' '))
	{ 
		count ++;
	}	
}
System.out.println("count of wolrd"+count);   
}
}






