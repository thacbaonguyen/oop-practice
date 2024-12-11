package OOP28;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop28 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("ONLINE.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<SinhVien> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String hoTen = sc.nextLine();
			String start = sc.nextLine();
			String end = sc.nextLine();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime startTime = LocalDateTime.parse(start, dtf);
			LocalDateTime endTime = LocalDateTime.parse(end, dtf);
			SinhVien sinhVien = new SinhVien(hoTen, startTime, endTime);
			arr.add(sinhVien);
		}
		Collections.sort(arr);
		for(SinhVien x : arr) {
			System.out.println(x);
		}
	}
}
