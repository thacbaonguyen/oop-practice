package Mang_Va_Xau;

import java.util.Scanner;

public class bai3 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++) {
			int a = (int)Math.sqrt(i);
			if(a * a == i) {
				System.out.println(i);
			}
		}
	}
}
