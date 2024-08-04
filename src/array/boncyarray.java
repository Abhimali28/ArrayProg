package array;
import java.util.Scanner;
public class boncyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int a = sc.nextInt();
        int a1[] = new int[a];
       
        System.out.println("enter no");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i <a1.length; i++) {
            isboncy(a1[i]);
        }
    }
    public static void isboncy(int a) {
    	int temp = a;
        int pos = 0;
        int neg = 0;
        while (a > 9) {
            int rem1 = a % 10;
            a = a / 10;
            int rem2 = a % 10;
            if(rem1 < rem2) {
            pos = 1;
            }
            if (rem1 > rem2) {
                neg = 1;
            }
            if (pos == 1 && neg == 1) {
                System.out.println("it boncy:"+temp);
            }
        }
    }
}