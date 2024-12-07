package oop16;

public class SinhVien {
	private String maSv;
	private String hoVaTen;
	private String lop;
	private int diemChuyenCan;
	private String ghiChu;
	public SinhVien(String maSv, String hoVaTen, String lop) {
		super();
		this.maSv = maSv;
		this.hoVaTen = hoVaTen;
		this.lop = lop;
	}
	public String getMaSv() {
		return maSv;
	}
	public int getDiemChuyenCan() {
		return diemChuyenCan;
	}
	public void setDiemChuyenCan(int diemChuyenCan) {
		this.diemChuyenCan = diemChuyenCan;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	
	public String getLop() {
		return lop;
	}
	public String toString() {
		if(diemChuyenCan == 0) return maSv + " " + hoVaTen + " " + lop + " " + diemChuyenCan + " KDDK";
		else return maSv + " " + hoVaTen + " " + lop + " " + diemChuyenCan;
		
	}
}
