package OOP22;

import java.util.Date;

public class KhachHang {
	private String maKhachhang;
	private String tenKhachHang;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;
	public KhachHang(int id, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.maKhachhang = "KH" + String.format("%03d", id);
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public String getMaKhachhang() {
		return maKhachhang;
	}
	@Override
	public String toString() {
		return tenKhachHang + " " + diaChi + " ";
	}
	
}
