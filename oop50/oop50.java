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
//class HocPhan implements Comparable<HocPhan>{
//	private String maNhom;
//	private String maMon;
//	private int ngayGiangDay;
//	private int kipHoc;
//	private String tenGiangVien;
//	private String phongHoc;
//	private String tenMon;
//	private static int cnt = 1;
//	public HocPhan(String maMon, int ngayGiangDay, int kipHoc, String tenGiangVien, String phongHoc) {
//		super();
//		maNhom = "HP" + String.format("%03d", cnt++);
//		this.maMon = maMon;
//		this.ngayGiangDay = ngayGiangDay;
//		this.kipHoc = kipHoc;
//		this.tenGiangVien = tenGiangVien;
//		this.phongHoc = phongHoc;
//	}
//	public String getMaMon() {
//		return maMon;
//	}
//	public String getTenGiangVien() {
//		return tenGiangVien;
//	}
//	
//	public String getTenMon() {
//		return tenMon;
//	}
//	public void setTenMon(String tenMon) {
//		this.tenMon = tenMon;
//	}
//	@Override
//	public int compareTo(HocPhan o) {
//		if(ngayGiangDay != o.ngayGiangDay) return Integer.compare(ngayGiangDay, o.ngayGiangDay);
//		else if(kipHoc != o.kipHoc) return Integer.compare(this.kipHoc, o.kipHoc) ;
//		else return this.tenGiangVien.compareTo(o.tenGiangVien);
//	}
//	public String toString1() {
//		return maNhom + " ";
//	}
//	public String toString2() {
//		return ngayGiangDay + " " + kipHoc + " " + phongHoc;
//	}
//}
//class MonHoc {
//	private String maMon;
//	private String tenMon;
//	private int soTinChi;
//	public MonHoc(String maMon, String tenMon, int soTinChi) {
//		super();
//		this.maMon = maMon;
//		this.tenMon = tenMon;
//		this.soTinChi = soTinChi;
//	}
//	public String getMaMon() {
//		return maMon;
//	}
//	public void setMaMon(String maMon) {
//		this.maMon = maMon;
//	}
//	public String getTenMon() {
//		return tenMon;
//	}
//	public void setTenMon(String tenMon) {
//		this.tenMon = tenMon;
//	}
//	
//}
//
