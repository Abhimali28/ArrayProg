package Perfectjava;
public class pal {
public static void main(String[] args) {
//	int a=123;
//	int sum=0;
//	int rev=0;
//	while(a>0)
//	{
//		int temp=a%10;
//		rev=rev*10+(temp);
//		a=a/10;
//	}
//	System.out.println(rev
//			);
String str="maDam";
String rev="ere";
int strlen =str.length();
for(int i=strlen-1;i>=0;--i)
{
	rev =rev+str.charAt(i);
}
if(str.toLowerCase().equals(rev.toLowerCase()))
{
	System.out.println("it is Palindrom String");
}
else
{
	System.out.println("it is not palindrom String");
}
}}