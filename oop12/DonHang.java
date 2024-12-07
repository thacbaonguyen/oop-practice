package oop12;

public class DonHang {
	private String maDonHang, hangSanXuat;
	private long soLuong, donGia;
	private double thue;
	public DonHang(String maDonHang, String hangSanXuat, long soLuong, long donGia, double thue) {
		this.maDonHang = maDonHang;
		this.hangSanXuat = hangSanXuat;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thue = thue;
	}
	public String toString() {
		double tongThue = soLuong* donGia * thue;
		double tongSauThue = soLuong* donGia + tongThue;
		return maDonHang + " " + hangSanXuat + " " + donGia + " " + (long)tongThue + " " + (long)tongSauThue;
	}
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	
}
