package oop46;

public class SinhVien implements Comparable<SinhVien>{
	private String maSinhVien;
	private String hoTen;
	private int diem1, diem2, diem3;
	private double diemTrungBinh;
	private int xepHang;
	private static int cnt = 1;
	public SinhVien(String hoTen, int diem1, int diem2, int diem3) {
		super();
		maSinhVien = "SV" + String.format("%02d", cnt++);
		hoTen = hoTen.toLowerCase();
		String s[] = hoTen.trim().split("\\s+");
		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
		for(int i = 1; i <s.length; i++) this.hoTen += " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
		this.diemTrungBinh = Math.round(((diem1 * 3 + diem2 * 3 + diem3 * 2) / 8.0) * 100.0) / 100.0;
	}
	
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getXepHang() {
		return xepHang;
	}

	public void setXepHang(int xepHang) {
		this.xepHang = xepHang;
	}

	@Override
	public int compareTo(SinhVien o) {
		if(diemTrungBinh != o.diemTrungBinh) return Double.compare(o.diemTrungBinh, this.diemTrungBinh);
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maSinhVien + " " + hoTen + " " + String.format("%.2f", diemTrungBinh) + " " + xepHang;
	}
}
