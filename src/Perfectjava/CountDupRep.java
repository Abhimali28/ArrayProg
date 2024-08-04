package Perfectjava;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class CountDupRep {
public static void main(String[] args) {
	String a="aabbccdd";
	Map <Character ,Integer>map=new LinkedHashMap<>();  
	char[]c=a.toCharArray();
	for(char ch : c)
	{
		if(!map.containsKey(ch))  
		{
			map.put(ch, 1);   
		}
		else   
		{   
			int obj=map.get(ch);
			map.put(ch, obj+1);
		} 
	}
	System.out.println(map);
}
}