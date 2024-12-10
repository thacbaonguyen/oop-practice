package oop56;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop56 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
		Scanner sc2 = new Scanner(new File("BAITAP.in"));
		Scanner sc3 = new Scanner(new File("NHOM.in"));
		int n = sc1.nextInt();
		sc1.nextLine();
		ArrayList<SinhVien> arr1 = new ArrayList<>();
		for(int i = 0; i <n ; i++) {
			arr1.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
		}
		int m = sc2.nextInt();
		sc2.nextLine();
		ArrayList<BaiTap> arr2 = new ArrayList<>();
		for(int i = 0 ; i < m; i ++) {
			arr2.add(new BaiTap(sc2.nextLine()));
		}
		ArrayList<Nhom> arr3 = new ArrayList<>();
		for(int i =0; i < n; i++) {
			arr3.add(new Nhom(sc3.next(), Integer.parseInt(sc3.nextLine().trim())));
		}
		for(Nhom x : arr3) {
			for(SinhVien y : arr1) {
				if(x.getMaSinhVien().equals(y.getMaSinhVien())) {
					y.setNhomBaiTap(x.getNhomBaiTap());
				}
			}
		}
		for(BaiTap x : arr2) {
			for(SinhVien y : arr1) {
				if(y.getNhomBaiTap() == x.getNhomBaiTap()) {
					y.setTenBaiTap(x.getTenBaiTap());
				}
			}
		}
		Collections.sort(arr1);
		for(SinhVien x : arr1) System.out.println(x);
	}
}