package Mang_Va_Xau;

import java.util.Scanner;

public class bai4 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int cnt =0;
		while(a > 0) {
			int k =(int) a % 10;
			if(check(k)) {
				cnt ++;
			}
			a/=10;
		}
		System.out.println(cnt);
	}
	public static boolean check(int a) {
		if(a == 2 || a == 3 || a == 5 || a == 7) return true;
		return false;
	}
}
