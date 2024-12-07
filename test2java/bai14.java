package test2java;

import java.util.Scanner;

public class bai14 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = a; i <= b; i++) {
			if(inspect(i) && thuanNgich(i)) System.out.print(i);
		}
		
	}
	public static boolean thuanNgich(int n) {
		int m = n;
		int res = 0;
		while(n > 0) {
			int k = n % 10;
			res = res * 10 + k;
			n/=10;
		}
		return res == m;
	}
	public static boolean inspect(int n) {
		boolean check1 = false;
		boolean check2 = false;
		int sum = 0;
		while(n > 0) {
			int k = n % 10;
			if(k == 6) check1 = true;
			sum += k;
			n/=10;
		}
		if(check1 == true && sum%10 == 8) return true;
		else return false;
	}
}
