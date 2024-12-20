package oop47;

public class SinhVien implements Comparable<SinhVien>{
	private String maSinhVien;
	private String hoTen;
	private int diemLuyenTap, diemThucHanh, diemThi;
	private double diemTongKet;
	private String xepLoai;
	private static int cnt = 1;
	public SinhVien(String hoTen, int diemLuyenTap, int diemThucHanh, int diemThi) {
		super();
		maSinhVien = "SV" + String.format("%02d", cnt++);
		hoTen = hoTen.toLowerCase();
		String s[] = hoTen.trim().split("\\s+");
		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
		for(int i = 1; i < s.length; i++) this.hoTen += " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
		this.diemLuyenTap = diemLuyenTap;
		this.diemThucHanh = diemThucHanh;
		this.diemThi = diemThi;
		diemTongKet = (diemLuyenTap* 0.25 + diemThucHanh* 0.35 + diemThi* 0.4);
		if(diemTongKet >= 8) xepLoai = "GIOI";
		else if(diemTongKet >= 6.5 && diemTongKet < 8) xepLoai = "KHA";
		else if(diemTongKet >= 5 && diemTongKet < 6.5) xepLoai = "TRUNG BINH";
		else if(diemTongKet < 5) xepLoai = "KEM";
		
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diemTongKet, this.diemTongKet);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maSinhVien + " " + hoTen + " " + String.format("%.2f", diemTongKet) + " " + xepLoai;
	}
}
