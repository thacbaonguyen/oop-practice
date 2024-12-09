package oop50;

public class MonHoc {
	private String maMon;
	private String tenMon;
	private int soTinChi;
	public MonHoc(String maMon, String tenMon, int soTinChi) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.soTinChi = soTinChi;
	}
	public String getMaMon() {
		return maMon;
	}
	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	
}
