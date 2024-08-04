package Perfectjava;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class DC {
 public static void main(String[]args)
 {
	 System.out.println("enter String");
	Scanner sc=new Scanner(System.in);
	//String a=sc.next();
	String a="sdfsfsdferwrw";
	Map<Character,Integer>map=new LinkedHashMap<>();
    char[]ch=a.toCharArray();
    for(char c:ch)   
	{
	  	if(!map.containsKey(c))
		{
		map.put(c,1);
		}else{
			int obj=map.get(c);
			map.put(c,obj+1);
		}
		}
    System.out.println(map);
	}   
}