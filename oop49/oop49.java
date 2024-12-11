package oop49;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class oop49 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<ThiSinh> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(arr);
		for(ThiSinh x : arr) System.out.println(x);
	}
}
