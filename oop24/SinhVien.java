package OOP24;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private String lop;
	private String ngaySinh;
	private double gpa;
	public SinhVien(int id, String hoTen, String lop, String ngaySinh, double gpa) {
		super();
		this.maSinhVien = "B20DCCN" + String.format("%03d", id);
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return maSinhVien + " " + hoTen + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
	}
}
