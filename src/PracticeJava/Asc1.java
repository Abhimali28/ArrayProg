package PracticeJava;

import java.util.Scanner;

public class Asc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of aaray");
		int a[] = new int[sc.nextInt()];
		System.out.println("enter elements array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int asc = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
