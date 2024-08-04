package TestPress;

public class sume {
public static void main(String[] args) {
	int a=12345;
	int sum=0;
	while(a>0)
	{
		int rem=a%10;
		sum=sum+rem;
	a=a/10;	
	}
	System.out.println(sum);
}
}
