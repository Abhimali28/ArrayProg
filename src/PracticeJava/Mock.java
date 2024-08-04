package PracticeJava;

import java.util.*;

public class Mock {
	public static void main(String[] args) {
//		System.out.println("enter no");
//	Scanner sc=new Scanner(System.in);
//	int a=sc.nextInt();
//	int rev=0;
//	while(a>0)
//	{
//		int temp=a%10;
//	 rev=(rev * 10)+(temp);
//		a=a/10;
//	}
//	System.out.println(rev);
		
		
//		int a=12345;
//		int sum=0;
//		while(a>0)
//		{
//			int temp=a%10;
//			sum=sum+temp;
//			a=a/10;
//		}
//		System.out.println(sum);
		
//		String s="abhishek";
//		StringBuffer sb=new StringBuffer();
//		Set<Character>set=new LinkedHashSet<Character>();
//		for(int i=0;i<s.length();i++)
//		{
//			set.add(s.charAt(i));
//			
//			
//		}
//		for(Character c:set)
//		{
//			sb.append(c);
//		}
//		System.out.println(sb);
		
//		String a="aabbccddee";
//		Map<Character,Integer>map=new LinkedHashMap<>();
//		char []ch=a.toCharArray();
//		for(char c:ch)
//		{
//			if(!map.containsKey(c))
//			{
//				map.put(c,1);
//			}
//			else
//			{
//				int obj =map.get(c);
//				map.put(c, obj+1);
//				
//			}
//		}
//		System.out.println(map);
//		String a="abhishek";
//		StringBuffer sb=new StringBuffer();
//		Set<Character>set=new LinkedHashSet<>();
//		for(int i=0;i<a.length();i++)
//		{
//		   set.add(a.charAt(i));
//		
//		}
//		for(Character c:set)
//		{
//		
//			sb.append(c);
//		}
//		System.out.println(sb);
//		int a=12345;
//		int sum=0;
//		while(a>0)
//		{
//			int temp=a%10;
//			sum=sum+temp;
//			a=a/10;
//		}
//		System.out.println(sum);
//		
//		int a=12345;
//		int rev=0;
//		while(a>0)
//		{
//			int temp=a%10;
//			rev=(rev*10)+temp;
//		a=a/10;	
//		}
//		System.out.println(rev);
		
//		String a="Abhishek";
//		StringBuffer sb=new StringBuffer();
//		Set<Character>set=new LinkedHashSet<>();
//		for(int i=0;i<a.length();i++)
//		{
//			set.add(a.charAt(i));
//		}
//		for(Character c:set)
//		{
//			sb.append(c);
//		}
//		System.out.println(sb);
		
//		String a ="cba";
//		StringBuffer sb=new StringBuffer(a);
//		System.out.println(sb.reverse());
////		
//		String a="abhi";
//		char[]ch=a.toCharArray();
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			System.out.print(a.charAt(i));
//			
//		}
//		String a="aabbccddee";
//		Map <Character ,Integer>map=new LinkedHashMap<>();
//		char[]ch=a.toCharArray();
//		for(char c:ch)
//		{
//			if(!map.containsKey(c))
//			{
//				map.put(c, 1);
//				
//			}
//			else
//			{
//				int obj=map.get(c);
//				map.put(c,obj+1);
//				
//			}}
//			System.out.println(map);
//		String a="abhishek";
//		StringBuffer sb=new StringBuffer();
//		Set <Character>set=new LinkedHashSet<>();
//		for(int i=0;i<a.length();i++)
//		{
//			set.add(a.charAt(i));
//		}
//		for(Character c:set)
//		{
//			sb.append(c);
//		}
//		System.out.println(sb);
		
//		int a=12345;
//		int sum=0;
//		while(a>0)
//		{
//			int temp=a%10;
//			sum=sum+temp;
//			a=a/10;
//			
		
//		}
//		System.out.println(sum);
		int a=121;
		int rev=0;
		while(a>0)
		{
			int temp=a%10;
			rev=(rev*10)+temp;
			a=a/10;
		}
		if(a==rev)
		{
			
			System.out.println("palindrom");
		}else
		{
			System.out.println("no palindrom");
		}
		
	
}}