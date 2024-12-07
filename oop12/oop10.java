package oop12;

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
//class DonHang {
//	private String maDonHang, hangSanXuat;
//	private long soLuong, donGia;
//	private double thue;
//	public DonHang(String maDonHang, String hangSanXuat, long soLuong, long donGia, double thue) {
//		this.maDonHang = maDonHang;
//		this.hangSanXuat = hangSanXuat;
//		this.soLuong = soLuong;
//		this.donGia = donGia;
//		this.thue = thue;
//	}
//	public String toString() {
//		double tongThue = soLuong* donGia * thue;
//		double tongSauThue = soLuong* donGia + tongThue;
//		return maDonHang + " " + hangSanXuat + " " + donGia + " " + (long)tongThue + " " + (long)tongSauThue;
//	}
//	public String getMaDonHang() {
//		return maDonHang;
//	}
//	public void setMaDonHang(String maDonHang) {
//		this.maDonHang = maDonHang;
//	}
//	public String getHangSanXuat() {
//		return hangSanXuat;
//	}
//	public void setHangSanXuat(String hangSanXuat) {
//		this.hangSanXuat = hangSanXuat;
//	}
//	public long getSoLuong() {
//		return soLuong;
//	}
//	public void setSoLuong(long soLuong) {
//		this.soLuong = soLuong;
//	}
//	public long getDonGia() {
//		return donGia;
//	}
//	public void setDonGia(long donGia) {
//		this.donGia = donGia;
//	}
//	public double getThue() {
//		return thue;
//	}
//	public void setThue(double thue) {
//		this.thue = thue;
//	}
//	
//}

