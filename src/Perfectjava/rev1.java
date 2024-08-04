package Perfectjava;

import java.util.*;

public class rev1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		System.out.println("enter the A Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("entre B matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("print A Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("print B Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("multiplication A and B Matrix");
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}