package oop18;

public class NhanVien {
	private String maNhanVien;
	private String tenNhanVien;
	private long luongCoBan;
	private int soNgayCong, heSo;
	private String phongBan;
	public NhanVien(String maNhanVien, String tenNhanVien, long luongCoBan, int soNgayCong, String phongBan, int heSo) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.soNgayCong = soNgayCong;
		this.phongBan = phongBan;
		this.heSo = heSo;
	}
	public String toString() {
		long luongThang = luongCoBan* soNgayCong* heSo* 1000;
		return maNhanVien + " " + tenNhanVien + " " + phongBan + " " + luongThang;
	}
	
}
