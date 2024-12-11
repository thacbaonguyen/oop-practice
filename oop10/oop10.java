package OOP10;

import java.util.ArrayList;
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
		for(DonHang x : arr) {
			System.out.println(x.toString());
		}
	}
}
