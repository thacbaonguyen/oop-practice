package oop10;

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
}
