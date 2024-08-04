package Perfectjava;
import java.util.*;
public class find_index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of Array");
		int a[] = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) { 
			a[i]= sc.nextInt(); 
		}    
		System.out.println("choice elements");  
		int search = sc.nextInt(); 
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) { 
				System.out.println("pregent");  
				return;   
			}	
		}
		System.out.println("absent");
	}
}
