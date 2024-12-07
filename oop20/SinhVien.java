package oop20;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private String soDienThoai;
	private int soThuTu;
	private String tenDeTai;
	public SinhVien(String maSinhVien, String hoTen, String soDienThoai, int soThuTu) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soThuTu = soThuTu;
	}
	public int getSoThuTu() {
		return soThuTu;
	}
	public void setSoThuTu(int soThuTu) {
		this.soThuTu = soThuTu;
	}
	public void setTenDeTai(String tenDeTai) {
		this.tenDeTai = tenDeTai;
	}
	
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public String toString() {
		return maSinhVien + " " + hoTen + " " + soDienThoai + " " + soThuTu + " " + tenDeTai;
	}
}
