package oop55;

public class HoaDon {
	private String maHoaDon;
	private String maKH;
	private String maMH;
	private long soLuong;
	private String hoTenKH;
	private String diaChi;
	private String tenMatHang, donViTinh;
	private long giaMua, giaBan, thanhTien;
	private static int cnt = 1;
	public HoaDon(String maKH, String maMH, long soLuong) {
		super();
		maHoaDon = "HD" + String.format("%03d", cnt++);
		this.maKH = maKH;
		this.maMH = maMH;
		this.soLuong = soLuong;
	}
	public String getMaKH() {
		return maKH;
	}
	public String getMaMH() {
		return maMH;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setTenMatHang(String tenMatHang) {
		this.tenMatHang = tenMatHang;
	}
	public void setGiaMua(long giaMua) {
		this.giaMua = giaMua;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	@Override
	public String toString() {
		long thanhTien = soLuong* giaBan;
		return maHoaDon + " " + hoTenKH + " " + diaChi + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + soLuong + " " + thanhTien;
	}
}

