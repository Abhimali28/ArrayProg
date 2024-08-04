
package Perfectjava;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class rev {
public static void main(String[] args) {
	String a="iamabhi";
	Map<Character,Integer>map=new LinkedHashMap<>();
    char[]ch=a.toCharArray();
	for(char c:ch)
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