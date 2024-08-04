package array;
import java.util.Scanner;
public class print1to10 {
	static  int i=1;
public static void main(String[] args) {
	m1();	
}
public static void m1()
{
	if(i<=10)
	{
		System.out.println(i++);
		m1();
}
	
}
}
