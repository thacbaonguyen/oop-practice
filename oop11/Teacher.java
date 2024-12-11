package OOP11;

public class Teacher {
	private String maNgach;
	private String hoTen;
	private long luongCoBan;
	private long phuCap;
	private int bacLuong;
	public Teacher(String maNgach, String hoTen, long luongCoBan, long phuCap, int bacLuong) {
		super();
		this.maNgach = maNgach;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.phuCap = phuCap;
		this.bacLuong = bacLuong;
	}
	public String toString() {
		long thuNhap = luongCoBan* bacLuong + phuCap;
		return maNgach + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap;
	}
}
