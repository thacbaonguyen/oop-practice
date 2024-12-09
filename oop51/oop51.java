package oop51;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oop51 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("STRING.in"));
		int  t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			int n = s2.length();
			for(int i = 0; i < s1.length()- n + 1; i++) {
//				System.out.println(s1.substring(i, i + n));
				if(s1.substring(i, i + n).equals(s2)) {
					System.out.print(i + 1 + " ");
				}
			}
			System.out.println();
		}
	}
}
