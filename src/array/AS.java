package array;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AS {
public static void main(String[] args) {
	     String a="fjdfjddjafn";
	     Map<Character ,Integer>map=new LinkedHashMap<>();
	     char c[]=a.toCharArray();
	     for(Character ch:c)
	     {
	    	 if(!map.containsKey(ch))
	    	 {
	    		 map.put(ch, 1);
	    	 }
	    	 else
	    	 {
	    		 int obj=map.get(ch);
	    		 map.put(ch, 1+obj);
	    	 }
	     }
	     System.out.println(map);
}
}
