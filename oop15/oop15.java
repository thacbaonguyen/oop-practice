package OOP15;

import java.util.ArrayList;
import java.util.Scanner;

public class oop15 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<SinhVien> arr = new ArrayList<>();
		for(int i =0; i < n; i++) {	
			String maSv = sc.nextLine();
			String hoVaTen = sc.nextLine();
			String lop = sc.nextLine();
			SinhVien sinhVien = new SinhVien(maSv, hoVaTen, lop);
			arr.add(sinhVien);
		}
		for(int i = 0; i < n; i++) {
			String ma = sc.next();
			
			String diemDanh = sc.nextLine().trim();
			int diemChuyenCan = 10;
			for(int j =0; j < 10; j++) {
				if(diemDanh.charAt(j) == 'v') diemChuyenCan-=2;
				if(diemDanh.charAt(j) == 'm') diemChuyenCan--;
			}
			for(SinhVien x : arr) {
				if(ma.equals(x.getMaSv())) {
					if(diemChuyenCan < 0) x.setDiemChuyenCan(0);
					else x.setDiemChuyenCan(diemChuyenCan);
//					System.out.println(x.getMaSv());
				}
			}
		}
		for(SinhVien x : arr) {
			System.out.println(x.toString());
		}
	}
}
//class SinhVien {
//	private String maSv;
//	private String hoVaTen;
//	private String lop;
//	private int diemChuyenCan;
//	private String ghiChu;
//	public SinhVien(String maSv, String hoVaTen, String lop) {
//		super();
//		this.maSv = maSv;
//		this.hoVaTen = hoVaTen;
//		this.lop = lop;
//	}
//	public String getMaSv() {
//		return maSv;
//	}
//	public void setMaSv(String maSv) {
//		this.maSv = maSv;
//	}
//	public int getDiemChuyenCan() {
//		return diemChuyenCan;
//	}
//	public void setDiemChuyenCan(int diemChuyenCan) {
//		this.diemChuyenCan = diemChuyenCan;
//	}
//	public String getGhiChu() {
//		return ghiChu;
//	}
//	public void setGhiChu(String ghiChu) {
//		this.ghiChu = ghiChu;
//	}
//	public String toString() {
//		if(diemChuyenCan == 0) return maSv + " " + hoVaTen + " " + lop + " " + diemChuyenCan + " KDDK";
//		else return maSv + " " + hoVaTen + " " + lop + " " + diemChuyenCan;
//		
//	}
//}
