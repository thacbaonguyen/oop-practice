package test2java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class string2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long sum = 0;
		ArrayList<Long> arr = new ArrayList<>();
		for(int i = 0;i < s.length() - 1; i++) {
			if(s.charAt(i) <= '9' && s.charAt(i) >= '0') {
				int a = s.charAt(i) - '0';
				sum = sum * 10 + a;
//				System.out.println(sum);
			}
			if(s.charAt(i + 1) > '9' || s.charAt(i + 1) < '0') {
				arr.add(sum);
				sum = 0;
			}
			if(i == s.length() - 2) {
				int a = s.charAt(i + 1) - '0';
				sum = sum * 10 + a;
				arr.add(sum);
			}
		}
		Collections.sort(arr);
		System.out.print(arr.get(arr.size() - 1));
	}
}
