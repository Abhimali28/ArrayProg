package Perfectjava;
import java.util.LinkedHashMap;
import java.util.Map;
public class CountChr {
public static void main(String[] args) {
	String a="i am abhishek";
	Map<Character, Integer>map=new LinkedHashMap<>();
	int count=1;
	char[]ch=a.toCharArray();
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)==' ')
		{
			count++;   
		}
	}
	System.out.println(count);
}
}

