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
//class HoaDon {
//	private String maHoaDon;
//	private long soLuongMua;
//	private static int cnt = 1;
//	private long donGia;
//	private String tenSanPham;
//	private double giamGia;
//	public HoaDon(String maHoaDon, long soLuongMua) {
//		super();
//		this.maHoaDon = maHoaDon + "-" + String.format("%03d", cnt++);
//		this.soLuongMua = soLuongMua;
//		if(soLuongMua >= 150) giamGia = 0.5;
//		else if(soLuongMua >= 100) giamGia = 0.3;
//		else if(soLuongMua >= 50) giamGia = 0.15;
//		else giamGia = 0;
//	}
//	public String getMaHoaDon() {
//		return maHoaDon;
//	}
//	public void setDonGia(long donGia) {
//		this.donGia = donGia;
//	}
//	public void setTenSanPham(String tenSanPham) {
//		this.tenSanPham = tenSanPham;
//	}
//	@Override
//	public String toString() {
//		long thanhTien = soLuongMua* donGia;
//		long tienGiamGia = (long) (giamGia*thanhTien);
//		// TODO Auto-generated method stub
//		return maHoaDon + " " + tenSanPham + " " + tienGiamGia + " " + (thanhTien - tienGiamGia);
//	}
//}
//class SanPham {
//	private String maSanPham;
//	private String tenSanPham;
//	private long donGiaLoai1, donGiaLoai2;
//	public SanPham(String maSanPham, String tenSanPham, long donGiaLoai1, long donGiaLoai2) {
//		super();
//		this.maSanPham = maSanPham;
//		this.tenSanPham = tenSanPham;
//		this.donGiaLoai1 = donGiaLoai1;
//		this.donGiaLoai2 = donGiaLoai2;
//	}
//	public String getMaSanPham() {
//		return maSanPham;
//	}
//	public void setMaSanPham(String maSanPham) {
//		this.maSanPham = maSanPham;
//	}
//	public String getTenSanPham() {
//		return tenSanPham;
//	}
//	public void setTenSanPham(String tenSanPham) {
//		this.tenSanPham = tenSanPham;
//	}
//	public long getDonGiaLoai1() {
//		return donGiaLoai1;
//	}
//	public void setDonGiaLoai1(long donGiaLoai1) {
//		this.donGiaLoai1 = donGiaLoai1;
//	}
//	public long getDonGiaLoai2() {
//		return donGiaLoai2;
//	}
//	public void setDonGiaLoai2(long donGiaLoai2) {
//		this.donGiaLoai2 = donGiaLoai2;
//	}
//	
//}
//
