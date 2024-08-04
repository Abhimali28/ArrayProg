package Perfectjava;
import java.util.*;
public class Letcode {
	//    public void isGood(int[] nums) {
	         public static void main(String[]args)
         { 
	            Scanner sc=new Scanner(System.in);
	            int[]nums1=new int[sc.nextInt()];
	            for(int i=0;i<nums1.length;i++)
	            {
	                nums1[i]=sc.nextInt();               
	                for(int j=0;j<nums1.length;j++)
	                {
	                    if(nums1[i]==nums1[j])
	                    {
	System.out.println("True");
	                    }
	                    else
	                    {
	System.out.println("false");
	                        }
	}
	}
}}