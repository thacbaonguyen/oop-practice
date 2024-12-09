package oop44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop44 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<ThiSinh> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		long soChiTieu = sc.nextLong();
		Collections.sort(arr);
		double diemTrungTuyen = arr.get(((int) soChiTieu) - 1).getDiemXetTuyen();
		for(ThiSinh x : arr) {
			if(x.getDiemXetTuyen() >= diemTrungTuyen) x.setTrangThai("TRUNG TUYEN ");
			else x.setTrangThai("TRUOT");
		}
		System.out.println(diemTrungTuyen);
		for(ThiSinh x : arr) {
			System.out.println(x);
		}
	}
}
//class ThiSinh implements Comparable<ThiSinh>{
//	private String maThiSinh;
//	private String hoTen;
//	private double diemToan, diemLy, diemHoa;
//	private double diemUuTien;
//	private double diemXetTuyen;
//	private String trangThai;
//	public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
//		super();
//		this.maThiSinh = maThiSinh;
//		hoTen = hoTen.trim().toLowerCase();
//		String s[] = hoTen.split("\\s+");
//		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
//		for(int i = 1; i <s.length; i++) this.hoTen+= " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
//		this.diemToan = diemToan;
//		this.diemLy = diemLy;
//		this.diemHoa = diemHoa;
//		String khuVuc = maThiSinh.substring(0, 3);
//		if(khuVuc.equals("KV1")) diemUuTien = 0.5;
//		else if(khuVuc.equals("KV2")) diemUuTien = 1.0;
//		else if(khuVuc.equals("KV3")) diemUuTien = 2.5;
//		diemXetTuyen = diemToan* 2 + diemHoa + diemLy + diemUuTien;
//	}
//
//	public double getDiemXetTuyen() {
//		return diemXetTuyen;
//	}
//
//	public void setDiemXetTuyen(double diemXetTuyen) {
//		this.diemXetTuyen = diemXetTuyen;
//	}
//	
//	public String getTrangThai() {
//		return trangThai;
//	}
//
//	public void setTrangThai(String trangThai) {
//		this.trangThai = trangThai;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		if(checkDiem(diemUuTien)) {
//			if(checkDiem(diemXetTuyen)) return maThiSinh + " " + hoTen + " " + (int)diemUuTien + " " + (int)diemXetTuyen + " " + trangThai;
//			else return maThiSinh + " " + hoTen + " " + (int)diemUuTien + " " + String.format("%.1f", diemXetTuyen) + " " + trangThai;
//		}
//		else {
//			if(checkDiem(diemXetTuyen)) return maThiSinh + " " + hoTen + " " + String.format("%.1f", diemUuTien) + " " + (int)diemXetTuyen + " " + trangThai;
//			else return maThiSinh + " " + hoTen + " " + String.format("%.1f", diemUuTien) + " " + String.format("%.1f", diemXetTuyen) + " " + trangThai;
//		}
//	}
//	public boolean checkDiem(double diem) {
//		if((diem*2)%2 ==0) return true;
//		return false;
//	}
//
//	@Override
//	public int compareTo(ThiSinh o) {
//		if(o.getDiemXetTuyen() != this.diemXetTuyen) return (int) (Math.floor(o.getDiemXetTuyen() - this.diemXetTuyen));
//		return this.maThiSinh.compareTo(o.maThiSinh);
//	}
//	
//}