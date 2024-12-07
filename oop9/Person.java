package oop9;

public class Person {
	private String maNv;
	private String hoVaTen;
	private int luongCoBan;
	private int soNgayCong;
	private String chucVu;
	private long phuCap;
	private float tienThuong;
	public Person(int stt, String hoVaTen, int luongCoBan, int soNgayCong, String chucVu, long phuCap, float tienThuong) {
		super();
		String ma = "";
		if(stt < 10) ma = "NV" + "0" + stt;
		else ma = "NV" + stt;
		this.maNv = ma;
		this.hoVaTen = hoVaTen;
		this.luongCoBan = luongCoBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
		this.phuCap = phuCap;
		this.tienThuong = tienThuong;
	}
	public String toString() {
		long luongThang = luongCoBan* soNgayCong;
		double tongThuong = tienThuong*luongThang;
		double tongLuong = luongThang + tongThuong + phuCap;
		return maNv+ " " + hoVaTen + " " + luongThang + " " + (long)tongThuong + " " + phuCap + " " + (long)tongLuong;
	}
	
}
