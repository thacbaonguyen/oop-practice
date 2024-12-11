package oop44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop44 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<ThiSinh> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		long soChiTieu = sc.nextLong();
		Collections.sort(arr);
		double diemTrungTuyen = arr.get(((int) soChiTieu) - 1).getDiemXetTuyen();
		for(ThiSinh x : arr) {
			if(x.getDiemXetTuyen() >= diemTrungTuyen) x.setTrangThai("TRUNG TUYEN ");
			else x.setTrangThai("TRUOT");
		}
		System.out.println(diemTrungTuyen);
		for(ThiSinh x : arr) {
			System.out.println(x);
		}
	}
}
