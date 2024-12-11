package Mang_Va_Xau;

import java.util.Scanner;

public class bai13 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(solve(a, b));
	}
	public static int solve(int a, int b) {
		int ans = 0;
		for(int i = b; i <= a; i++) {
			int tmp = i;
			while(tmp % b == 0) {
				++ans;
				tmp/=b;
			}
		}
		return ans;
	}
}
