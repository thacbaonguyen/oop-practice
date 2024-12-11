package oop45;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class oop45 {
	public static void main(String arg[]) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner sc = new Scanner(new File("XETTUYEN.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<ThiSinh> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		for(ThiSinh x : arr) System.out.println(x);
	}
}
