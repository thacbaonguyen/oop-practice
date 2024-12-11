package Mang_Va_Xau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class string1 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		ArrayList<Character> array = new ArrayList<>();
		ArrayList<Character> arr2 = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			Character v = s.charAt(i);
			for(int j = 0; j < t.length(); j++) {
				Character c = t.charAt(j);
				if(v.equals(c)) {
					array.add(c);
					break;
				}
			}
		}
		for(Character x : s.toCharArray()) arr2.add(x);
		for(Character y : t.toCharArray()) arr2.add(y);
		Collections.sort(array);
		LinkedHashSet<Character> set = new LinkedHashSet<>(array);
		for(Character x : set) System.out.print(x);
		System.out.println();
		Collections.sort(arr2);
		for(Character x : arr2) System.out.print(x);
	}
}
