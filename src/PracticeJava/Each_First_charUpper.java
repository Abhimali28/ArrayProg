package PracticeJava;
import java.util.*;
public class Each_First_charUpper {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String ");
String a=sc.nextLine();
String []s=a.split(" ");
for(int i=0;i<s.length;i++)
{
  char c=s[i].charAt(0);
//	String c1=String.valueOf(c).toUpperCase();
//	String sub=s[i].substring(i);
//	System.out.print(c1+sub+" ");
	String c1=String .valueOf(c).toUpperCase();
	String sub =s[i].substring(i);
	System.out.print(c1+sub+" ");
}
}
}