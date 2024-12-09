package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07001 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		ArrayList<String> arr = new ArrayList<>();
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			arr.add(s);
		}
		for(String x : arr) {
			System.out.println(x);
		}
	}
}
