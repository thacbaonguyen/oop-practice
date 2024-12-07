package basic;

import java.util.Scanner;

public class bai10 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		if(check(a)) System.out.print("Yes");
		else System.out.print("No");
	}
	public static boolean check(long n) {
		long res = 0;
		long m = n;
		while( n != 0) {
			long k  = n % 10;
			res = res * 10 + k;
			n/=10;
		}
		return res == m;
	}
}
