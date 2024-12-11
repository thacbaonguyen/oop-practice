package oop50;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop50 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("MONHOC.in"));
		Scanner sc2 = new Scanner(new File("LICHGD.in"));
		int n = sc1.nextInt();
		sc1.nextLine();
		ArrayList<MonHoc> arr1 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr1.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine())));
		}
		int m = sc2.nextInt();
		sc2.nextLine();
		ArrayList<HocPhan> arr2 = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			arr2.add(new HocPhan(sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine()));
		}
		String hoTenGiangVien = sc2.nextLine();
		Collections.sort(arr2);
		for(HocPhan x : arr2) {
			if(x.getTenGiangVien().equals(hoTenGiangVien)) {
				for(MonHoc y : arr1) {
					if(y.getMaMon().equals(x.getMaMon())) {
						
						x.setTenMon(y.getTenMon());
					}
				}
			}
		}

		System.out.println("LICH GIANG DAY GIANG VIEN " + hoTenGiangVien + ":");
		for(HocPhan x : arr2) {
			if(x.getTenGiangVien().equals(hoTenGiangVien)) {
				System.out.print(x.toString1() + x.getTenMon()+ " ");
				System.out.println(x.toString2());
			}
		}
	}
}
