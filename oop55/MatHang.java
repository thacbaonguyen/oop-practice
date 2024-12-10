package oop55;

public class MatHang {
	private String maMatHang;
	private String tenMatHang;
	private String donViTinh;
	private long giaMua;
	private long giaBan;
	private static int cnt = 1;
	public MatHang(String tenMatHang, String donViTinh, long giaMua, long giaBan) {
		super();
		maMatHang = "MH" + String.format("%03d", cnt++);
		this.tenMatHang = tenMatHang;
		this.donViTinh = donViTinh;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
	}
	public String getMaMatHang() {
		return maMatHang;
	}
	public String getTenMatHang() {
		return tenMatHang;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public long getGiaMua() {
		return giaMua;
	}
	public long getGiaBan() {
		return giaBan;
	}
}
