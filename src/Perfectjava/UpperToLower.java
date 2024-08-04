package Perfectjava;
import java.util.*;
public class UpperToLower {
public static void main(String[] args) {
	System.out.println("enter Any Character");
	Scanner sc=new Scanner(System.in);
	char ch;
   char ch2;
   ch=sc.next().charAt(0);
   if(ch>='A' && ch<='Z')
   {
	   ch2=Character.toLowerCase(ch);
	   System.out.println("Uppercase"+ch2);
   }
   if(ch>='a' && ch<='z')
   {
	   ch2=Character.toUpperCase(ch);
	   System.out.println("lower Case"+ch2);
   }
	}
}