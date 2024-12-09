package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07002 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		ArrayList<String> arr = new ArrayList<>();
		while (sc.hasNext()) {
			String s = sc.next();
			arr.add(s);
		}
		long sum = 0;
		for (String x : arr) {
			sum+= num(x);
		}
		System.out.print(sum);
	}
	public static int num(String s) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
	}
}
