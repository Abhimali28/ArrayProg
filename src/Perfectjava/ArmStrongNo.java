package Perfectjava;
import java.util.Scanner;
public class ArmStrongNo {
	public static void main(String[] args) {
//		int a = 153;
//		int rem = 0;
//		int mul = 0;
//		int n = a;
//		while (a > 0) {
//			rem = a % 10;
//			mul = (rem * rem * rem) + mul;
//			a = a / 10;
//		}
//		if (n == mul) {
//			System.out.println("it is ArmStrong no");
//		} else {
//			System.out.println("it no ArmStrong num");
//		}
		System.out.println("enter the Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=0;
		int mul=0;
		int n=a;
		while(a>0)
		{
			rem=a%10;
			mul=(rem*rem*rem)+mul;
			a=a/10;
		}
		if(n==mul)
		{
			System.out.println("it is Armstrong no");
		}
		else
		{
			System.out.println("it is not Armstrong no");
		}
	}
}