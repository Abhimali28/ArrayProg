package Perfectjava;
import java.util.LinkedHashSet;
import java.util.Set;
public class SkipDuplicateChar {
public static void main(String[] args) {
	String a="aabbccdd";
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