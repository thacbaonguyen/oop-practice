package oop54;

public class HoaDon {
	private String maHoaDon;
	private long soLuongMua;
	private static int cnt = 1;
	private long donGia;
	private String tenSanPham;
	private double giamGia;
	public HoaDon(String maHoaDon, long soLuongMua) {
		super();
		this.maHoaDon = maHoaDon + "-" + String.format("%03d", cnt++);
		this.soLuongMua = soLuongMua;
		if(soLuongMua >= 150) giamGia = 0.5;
		else if(soLuongMua >= 100) giamGia = 0.3;
		else if(soLuongMua >= 50) giamGia = 0.15;
		else giamGia = 0;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	@Override
	public String toString() {
		long thanhTien = soLuongMua* donGia;
		long tienGiamGia = (long) (giamGia*thanhTien);
		// TODO Auto-generated method stub
		return maHoaDon + " " + tenSanPham + " " + tienGiamGia + " " + (thanhTien - tienGiamGia);
	}
}
