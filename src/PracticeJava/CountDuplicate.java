package PracticeJava;
import java.util.Scanner;
public class CountDuplicate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of Array");
	int []a=new int[sc.nextInt()];
System.out.println("enter Array elements");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
		for(int j=1+i;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	}
}
System.out.println(count);
}
}