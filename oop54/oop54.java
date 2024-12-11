package oop54;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class oop54 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("DATA1.in"));
		Scanner sc2 = new Scanner(new File("DATA2.in"));
		int n = sc1.nextInt();
		sc1.nextLine();
		ArrayList<SanPham> arr1 = new ArrayList<>();
		for(int i = 0 ; i < n; i++) {
			arr1.add(new SanPham(sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
		}
		int m = sc2.nextInt();
		sc2.nextLine();
		ArrayList<HoaDon> arr2 = new ArrayList<>();
		for(int i = 0 ; i < m; i++) {
			arr2.add(new HoaDon(sc2.next(), Long.parseLong(sc2.nextLine().trim())));
		}
		for(HoaDon x : arr2) {
			String maSP = x.getMaHoaDon().substring(0, 3);
			for(SanPham y : arr1) {
				if(maSP.substring(0, 2).equals(y.getMaSanPham())) {
					x.setTenSanPham(y.getTenSanPham());
					if(maSP.substring(2).equals("1")) x.setDonGia(y.getDonGiaLoai1());
					else x.setDonGia(y.getDonGiaLoai2());
				}
			}
		}
		for(HoaDon x : arr2) System.out.println(x);
	}
}
