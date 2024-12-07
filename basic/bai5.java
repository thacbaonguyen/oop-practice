package basic;

import java.util.Scanner;

public class bai5 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = (int)Math.sqrt(a); i <=(int)Math.sqrt(b); i++) {
			System.out.println(Math.pow(i, 2));
		}
	}
	public static boolean check(int n) {
		int m = (int)Math.sqrt(n);
		if(m * m == n) return true;
		return false;
	}
}
