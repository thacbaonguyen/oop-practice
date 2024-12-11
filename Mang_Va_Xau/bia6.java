package Mang_Va_Xau;

import java.util.Scanner;

public class bia6 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long tong = 0;
		for(long i = 1; i <=n; i++) {
			if(n % i == 0) {
				tong += i;
			}
		}
		System.out.print(tong);
	}
}
