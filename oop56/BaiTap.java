package oop56;

public class BaiTap {
	private String tenBaiTap;
	private int nhomBaiTap;
	private static int cnt = 0;
	public BaiTap(String tenBaiTap) {
		super();
		this.tenBaiTap = tenBaiTap;
		this.nhomBaiTap = ++cnt;
	}
	public String getTenBaiTap() {
		return tenBaiTap;
	}
	public int getNhomBaiTap() {
		return nhomBaiTap;
	}
	
}
