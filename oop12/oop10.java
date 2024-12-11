package OOP12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class oop10 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<DonHang> arr = new ArrayList<>();
		for(int i =0; i< n; i++) {
			sc.nextLine();
			String maDonHang = sc.next();
			long soLuong = sc.nextInt();
			String tenHang = "";
			long donGia = 0;
			double thue = 0;
			if(maDonHang.substring(maDonHang.length() - 2).equals("BP")) {
				tenHang = "British Petro";
			}
			if(maDonHang.substring(maDonHang.length() - 2).equals("ES")) {
				tenHang = "Esso";
			}
			if(maDonHang.substring(maDonHang.length() - 2).equals("SH")) {
				tenHang = "Shell";
			}
			if(maDonHang.substring(maDonHang.length() - 2).equals("CA")) {
				tenHang = "Castrol";
			}
			if(maDonHang.substring(maDonHang.length() - 2).equals("MO")) {
				tenHang = "Mobil";
			}
			
			if(maDonHang.charAt(0) == 'X') {
				donGia = 128000;
				thue = 0.03;
			}
			if(maDonHang.charAt(0) == 'D') {
				donGia = 11200;
				thue = 0.035;
			}
			if(maDonHang.charAt(0) == 'N') {
				donGia = 9700;
				thue = 0.02;
			}
			if(maDonHang.substring(maDonHang.length() - 2).equals("TN")) {
				tenHang = "Trong Nuoc";
				thue = 0;
			}
			DonHang donHang = new DonHang(maDonHang, tenHang, soLuong, donGia, thue);
			arr.add(donHang);
		}
		Collections.sort(arr, new Comparator<DonHang>() {

			@Override
			public int compare(DonHang o1, DonHang o2) {
				double t1 = o1.getSoLuong()* o1.getDonGia() *(o1.getThue() + 1);
				double t2 = o2.getSoLuong()* o2.getDonGia() *(o2.getThue() + 1);
				return (int) (t2 - t1);
			}

		});
		for(DonHang x : arr) {
			System.out.println(x.toString());
		}
	}
}
