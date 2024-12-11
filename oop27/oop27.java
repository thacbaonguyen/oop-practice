package OOP27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop27 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		Scanner sc2 = new Scanner(new File("LICHGD.in"));
		int k = sc.nextInt();
		ArrayList<MonHoc> arr1 = new ArrayList<>();
		for(int i = 0; i < k; i ++) {
			String maMon = sc.next();
			sc.nextLine();
			String tenMon = sc.nextLine();
			int soTinChi = sc.nextInt();
			MonHoc monHoc = new MonHoc(maMon, tenMon, soTinChi);
			arr1.add(monHoc);
		}
//		for(MonHoc x : arr1)
//			System.out.println(x.getMaMon());
		int n = sc2.nextInt();
		
		ArrayList<LopHoc> arr2 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String maMon = sc2.next();
			int ngayDay = sc2.nextInt();
			int kip = sc2.nextInt();
			sc2.nextLine();
			String hoTenGV = sc2.nextLine();
			String phongHoc = sc2.next();
			LopHoc lopHoc = new LopHoc(maMon, ngayDay, kip, hoTenGV, phongHoc);
			arr2.add(lopHoc);
		}
		String maMH = sc2.next();
		for(MonHoc x : arr1) {
			if(maMH.equals(x.getMaMon())) System.out.println("LICH GIANG DAY MON " + x.getTenMon() +":");
		}
		Collections.sort(arr2);
		for(LopHoc x : arr2) {
			if(maMH.equals(x.getMaMon())) {
				System.out.println(x.toString());
			}
		}
		sc.close();
		sc2.close();
	}
}
//class LopHoc implements Comparable<LopHoc>{
//	private String maNhom, maMon;
//	private int ngayDay, kip;
//	private String hoTenGV, phongHoc;
//	private static int ID = 0;
//	public LopHoc(String maMon, int ngayDay, int kip, String hoTenGV, String phongHoc) {
//		this.maNhom = "HP" + String.format("%03d", ++ID);
//		this.maMon = maMon;
//		this.ngayDay = ngayDay;
//		this.kip = kip;
//		this.hoTenGV = hoTenGV;
//		this.phongHoc = phongHoc;
//	}
//	
//	public String getMaMon() {
//		return maMon;
//	}
//
//	public void setMaMon(String maMon) {
//		this.maMon = maMon;
//	}
//
//	public int getNgayDay() {
//		return ngayDay;
//	}
//
//	public void setNgayDay(int ngayDay) {
//		this.ngayDay = ngayDay;
//	}
//
//	public int getKip() {
//		return kip;
//	}
//
//	public void setKip(int kip) {
//		this.kip = kip;
//	}
//
//	@Override
//	public int compareTo(LopHoc o) {
//		if(this.ngayDay == o.getNgayDay()) {
//			return this.kip - o.getKip();
//		}
//		else return this.ngayDay - o.getNgayDay();
//		
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return maNhom + " " + ngayDay + " " + kip + " " + hoTenGV + " " + 	phongHoc;
//	}
//}
//class MonHoc {
//	private String maMon, tenMon;
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
//	public String getTenMon() {
//		return tenMon;
//	}
//	
//}

