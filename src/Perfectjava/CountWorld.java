package Perfectjava;
import java.util.*;
public class CountWorld {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the world");
String a=sc.nextLine();
int count=1;
char ch[]=a.toCharArray();
for(int i=0;i<a.length();i++)
{
	if((a.charAt(i)==' ' )&& (a.charAt(i+1)!=' '))
	{
		count++;
	}
}
System.out.println("count of total world"+" "+count);
}
}