package oop43;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class oop43 {
	public static void main(String arg[]) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<KhachHang> arr = new ArrayList<>();
		while (n-- > 0)
            arr.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
		Collections.sort(arr);
		for(KhachHang x : arr) {
			System.out.println(x);
		}
	}
}