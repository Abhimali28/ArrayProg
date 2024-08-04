package Perfectjava;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class br {
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc=new Scanner(System.in);
	    int a[]=new int[sc.nextInt()];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    int max=a[0];
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]<max)
	    	{
	    		max=a[i];
	    	}
	    }	    
	    System.out.println(max);
	}
}
