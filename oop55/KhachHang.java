package oop55;

public class KhachHang {
	private String maKhachHang;
	private String tenKhachHang;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;
	private static int cnt = 1;
	public KhachHang(String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		maKhachHang = "KH" + String.format("%03d", cnt++);
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}
	
}
