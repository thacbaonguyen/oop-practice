package basic;

import java.util.Scanner;

public class bai8 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
		System.out.print(bcd(a, b));
	}
	public static int gcd(int a, int b) {
		while ( b != 0) {
			int remain = a % b;
			a = b;
			b = remain;
		}
		return a;
	}
	public static int bcd(int a, int b) {
		return a*b/gcd(a, b);
	}
}
