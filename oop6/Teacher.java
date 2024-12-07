package oop6;

public class Teacher {
	private String maGv;
	private String hoTen;
	private long luongCoBan;
	private int bacLuong;
	private long phuCap;
	private long tongLuong;
//	public String getMaGv() {
//		return maGv;
//	}
//	public void setMaGv(String maGv) {
//		this.maGv = maGv;
//	}
//	public String getHoTen() {
//		return hoTen;
//	}
//	public void setHoTen(String hoTen) {
//		this.hoTen = hoTen;
//	}
//	public long getLuongCoBan() {
//		return luongCoBan;
//	}
//	public void setLuongCoBan(long luongCoBan) {
//		this.luongCoBan = luongCoBan;
//	}
//	public int getBacLuong() {
//		return bacLuong;
//	}
//	public void setBacLuong(int bacLuong) {
//		this.bacLuong = bacLuong;
//	}
//	public long getTongLuong() {
//		return tongLuong;
//	}
//	public void setTongLuong(long tongLuong) {
//		this.tongLuong = tongLuong;
//	}
//	public long getPhuCap() {
//		return phuCap;
//	}
//	public void setPhuCap(long phuCap) {
//		this.phuCap = phuCap;
//	}
	public Teacher(String maGv, String hoTen, long luongCoBan, int bacLuong, long phuCap, long tongLuong) {
		super();
		this.maGv = maGv;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.bacLuong = bacLuong;
		this.phuCap = phuCap;
		this.tongLuong = tongLuong;
	}
	public String toString() {
		return maGv + " " + hoTen + " " + bacLuong + " " + phuCap + " " + tongLuong;
	}
	
}
