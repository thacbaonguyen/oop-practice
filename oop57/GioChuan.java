package oop57;

public class GioChuan {
	private String maGV, maMon;
	private double gioChuan;
	public GioChuan(String maGV, String maMon, double gioChuan) {
		super();
		this.maGV = maGV;
		this.maMon = maMon;
		this.gioChuan = gioChuan;
	}
	public String getMaGV() {
		return maGV;
	}
	public String getMaMon() {
		return maMon;
	}
	public double getGioChuan() {
		return gioChuan;
	}
	
}
