package oop56;

public class SinhVien implements Comparable<SinhVien>{
	private String maSinhVien, hoTenSinhVien, soDienThoai;
	private int nhomBaiTap;
	private String tenBaiTap;
	public SinhVien(String maSinhVien, String hoTenSinhVien, String soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTenSinhVien = hoTenSinhVien;
		this.soDienThoai = soDienThoai;
	}
	public void setNhomBaiTap(int nhomBaiTap) {
		this.nhomBaiTap = nhomBaiTap;
	}
	public void setTenBaiTap(String tenBaiTap) {
		this.tenBaiTap = tenBaiTap;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public int getNhomBaiTap() {
		return nhomBaiTap;
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maSinhVien + " " + hoTenSinhVien + " " + soDienThoai + " " +nhomBaiTap + " " + tenBaiTap;
	}
}
