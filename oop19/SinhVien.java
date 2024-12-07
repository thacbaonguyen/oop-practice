package oop19;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private String soDienThoai;
	private int soThuTu;
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
	public String toString() {
		return maSinhVien + " " + hoTen + " " + soDienThoai;
	}
}
