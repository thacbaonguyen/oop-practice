package Mang_Va_Xau;

import java.util.Scanner;

public class bai7 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		StringBuilder result = new StringBuilder();
		if(checkSnt(n)) System.out.println(n);
		else {
			for(int i = 2; i <=(int)Math.sqrt(m); i++) {
				int count = 0;
				while(n % i == 0) {
					count++;
					n/=i;
//					System.out.print(i);
//					if(n != 1) System.out.print("x");
				}
				if(count > 0) {
					result.append(i);
					if(count > 1) result.append("^").append(count);
					result.append("x");
				}
			}
//			if(n != 1) System.out.print(n);
			if(n != 1) {
				result.append(n);
				
			}
			else {
				result.setLength(result.length() - 1);
			}
		}
		System.out.println(result.toString());
	}
	public static boolean checkSnt(int n) {
		if(n < 2 ) return false;
		for(int i = 2; i<= (int)Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
