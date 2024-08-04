package TestPress;
import java.util.*;
public class ReverseNo {
public static void main(String[] args) {
	System.out.println("enter data");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int rev=0;
	while(a>0)
	{
		int temp=a%10;
		rev=(rev*10)+temp;
		a=a/10;
	}
	System.out.println(rev);
}
}


