package basic;

import java.util.Scanner;

public class bai11 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibo(n));
	}
	public static long fibo(int n) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		long fn1 = 1, fn2 = 0, fn = 0;
		for(int i = 3; i <=n ; i++) {
			fn = fn1 + fn2;
			fn%= 1000000007;
			fn2 = fn1;
			fn1 = fn;
			
		}
		return fn%1000000007;
	}
}
