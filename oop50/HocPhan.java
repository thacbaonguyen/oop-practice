package oop50;

public class HocPhan implements Comparable<HocPhan>{
	private String maNhom;
	private String maMon;
	private int ngayGiangDay;
	private int kipHoc;
	private String tenGiangVien;
	private String phongHoc;
	private String tenMon;
	private static int cnt = 1;
	public HocPhan(String maMon, int ngayGiangDay, int kipHoc, String tenGiangVien, String phongHoc) {
		super();
		maNhom = "HP" + String.format("%03d", cnt++);
		this.maMon = maMon;
		this.ngayGiangDay = ngayGiangDay;
		this.kipHoc = kipHoc;
		this.tenGiangVien = tenGiangVien;
		this.phongHoc = phongHoc;
	}
	public String getMaMon() {
		return maMon;
	}
	public String getTenGiangVien() {
		return tenGiangVien;
	}
	
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	@Override
	public int compareTo(HocPhan o) {
		if(ngayGiangDay != o.ngayGiangDay) return Integer.compare(ngayGiangDay, o.ngayGiangDay);
		else if(kipHoc != o.kipHoc) return Integer.compare(this.kipHoc, o.kipHoc) ;
		else return this.tenGiangVien.compareTo(o.tenGiangVien);
	}
	public String toString1() {
		return maNhom + " ";
	}
	public String toString2() {
		return ngayGiangDay + " " + kipHoc + " " + phongHoc;
	}
}
