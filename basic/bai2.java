package basic;

import java.util.Scanner;

public class bai2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a % b == 0) {
			System.out.println(a);
		}
		else {
			int c = a/b;
			c++;
			System.out.println(c * b);
		}
	}

}
