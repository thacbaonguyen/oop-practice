package oop54;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private long donGiaLoai1, donGiaLoai2;
	public SanPham(String maSanPham, String tenSanPham, long donGiaLoai1, long donGiaLoai2) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGiaLoai1 = donGiaLoai1;
		this.donGiaLoai2 = donGiaLoai2;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public long getDonGiaLoai1() {
		return donGiaLoai1;
	}
	public void setDonGiaLoai1(long donGiaLoai1) {
		this.donGiaLoai1 = donGiaLoai1;
	}
	public long getDonGiaLoai2() {
		return donGiaLoai2;
	}
	public void setDonGiaLoai2(long donGiaLoai2) {
		this.donGiaLoai2 = donGiaLoai2;
	}
	
}
