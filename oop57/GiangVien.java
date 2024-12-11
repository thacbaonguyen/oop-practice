package oop57;

public class GiangVien {
	private String maGV, tenGV;
	private double gioChuan;
	public GiangVien(String maGV, String tenGV) {
		super();
		this.maGV = maGV;
		this.tenGV = tenGV;
	}
	public String getMaGV() {
		return maGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tenGV + " ";
	}
}
