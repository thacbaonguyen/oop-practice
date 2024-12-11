package OOP29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop29 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<SinhVien> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String maSV = sc.nextLine();
			String hoTen = sc.nextLine();
			String soDienThoai = sc.nextLine();
			String email = sc.nextLine();
			SinhVien sinhVien = new SinhVien(maSV, hoTen, soDienThoai, email);
			arr.add(sinhVien);
		}
		Collections.sort(arr);
		for(SinhVien x : arr) {
			System.out.println(x);
		}
	}
}
