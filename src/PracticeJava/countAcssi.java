package PracticeJava;
import java.util.*;
public class countAcssi {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter data");
char[]a=new char[sc.nextInt()];
for(char i=0;i<a.length;i++)
{
	a[i]=sc.next().charAt(0);
}
int sum=0;
for(char i=0;i<a.length;i++)
{
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		sum=sum+a[i];
}
System.out.println(sum);

	}
}
