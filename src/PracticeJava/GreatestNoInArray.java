package PracticeJava;
import java.util.*;
public class GreatestNoInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int[] a = new int[sc.nextInt()];

		System.out.println("enter the elemets");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{	
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}	
	}