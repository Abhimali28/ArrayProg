package array;

import java.util.Scanner;

class notoworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int a = sc.nextInt();
		String op = "";
		while (a != 0) {
			int rem = a % 10;
			switch (rem) {
			case 0:
				op = "zero" + "  " + op;
				break;
			case 1:
				op = "one" + "  " + op;
				break;
			case 2:
				op = "two" + " " + op;
				break;
			case 3:
				op = "three" + " " + op;
				break;
			case 4:
				op = "four" + " " + op;
				break;
			case 5:
				op = "five" + " " + op;
				break;
			case 6:
				op = "six" + " " + op;
				break;
			case 7:
				op = "seven" + " " + op;
				break;
			case 8:
				op = "eigth" + " " + op;
				break;
			case 9:
				op = "nine" + " " + op;
				break;
			}
			a = a / 10;
		}
		System.out.println("   " + op);
	}
}
