package Perfectjava;
import java.util.*;
public class FindMinNo {
public static void main(String[] args) {
String a="Adfdfdsf";
StringBuffer sb=new StringBuffer();
Set<Character>set=new LinkedHashSet<>();
for(int i=0;i<a.length();i++)
{
    set.add(a.charAt(i));
}
for(Character ch:set)
{
	sb.append(ch);
}
System.out.println(sb);
}
}