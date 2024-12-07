package test2java;

import java.util.Scanner;

public class bai12 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count = countP(n, p);
		System.out.print(count);
	}
	public static long giaiThua(int n) {
		int result  = 1;
		for(int i = 1; i <= n; i++) {
			result*=i;
		}
		return result;
	}
	public static int countP(int n, int p) {
		int ans = 0;
		for(int i = p; i <=n; i+=p) {
			int tmp = i;
			while(tmp % p == 0) {
				++ans;
				tmp/=p;
			}
		}
		return ans;
	}
}
