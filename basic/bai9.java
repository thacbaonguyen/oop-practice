package basic;

import java.util.Scanner;

public class bai9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.print(toHop(n, k));
	}
	public static long toHop(int n, int k) {
		long res = 1;
		for(int i =0; i<k; i++) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}
}
