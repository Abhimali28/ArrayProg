package array;

public class Stringpal {
public static void main(String[] args) {
	String a="madam";
	String b=" ";
	int rev=a.length();
	for(int i=rev-1;i>=0;--i)
	{
		rev=rev+a.charAt(i);
	}
	if(a.toLowerCase().equals(b.toLowerCase()))
	{
		System.out.println("palindrom String");
	}
	else
	{
		System.out.println("not palindrom");
	}
}
}
