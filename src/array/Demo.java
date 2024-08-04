package array;
import java.util.*;
public class Demo {   
public static void main(String[] args) {
String a="abhishek";
StringBuffer sb=new StringBuffer();
Set<Character>set=new LinkedHashSet<>();
for(int i=0;i<a.length();i++)
{
	set.add(a.charAt(i));
}
for(Character c:set)
{
	sb.append(c);
}
System.out.println(sb);
}
}
