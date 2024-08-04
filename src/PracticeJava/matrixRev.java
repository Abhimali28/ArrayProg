package PracticeJava;

import java.util.*;

public class matrixRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Arrray elements");
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		System.out.println("enter first matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				 a[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("enter second matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("print first matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("print second matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Addition of two matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}