package Perfectjava;
import java.util.LinkedHashMap;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
public class SkipDuplicate {
public static void main(String[] args) {
String a ="asddsaffsfds";
Map<Character,Integer>map=new LinkedHashMap<>();
char[] ch=a.toCharArray();
for(Character c:ch)
{
	if(!map.containsKey(c))
	{
		map.put(c, 1);
	}
	else
	{
		int obj=map.get(c);
		map.put(c, obj+1);
	}
}
System.out.println(map);
}
}