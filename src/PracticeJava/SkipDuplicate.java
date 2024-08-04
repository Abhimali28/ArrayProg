package PracticeJava;
import java.util.*;
public class SkipDuplicate {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a="aadddbbcc";
Map<Character,Integer>map=new LinkedHashMap<>();
char []ch=a.toCharArray();
for(char c:ch)
{
	if(!map.containsKey(c))
	{
		map.put(c, 1);
	}
	else
	{
		int obj=map.get(c);
		map.put(c,obj+1);
	}
	
}
System.out.println(map);
}
}
