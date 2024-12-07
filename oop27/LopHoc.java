package oop27;

public class LopHoc implements Comparable<LopHoc>{
	private String maNhom, maMon;
	private int ngayDay, kip;
	private String hoTenGV, phongHoc;
	private static int ID = 0;
	public LopHoc(String maMon, int ngayDay, int kip, String hoTenGV, String phongHoc) {
		this.maNhom = "HP" + String.format("%03d", ++ID);
		this.maMon = maMon;
		this.ngayDay = ngayDay;
		this.kip = kip;
		this.hoTenGV = hoTenGV;
		this.phongHoc = phongHoc;
	}
	
	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public int getNgayDay() {
		return ngayDay;
	}

	public void setNgayDay(int ngayDay) {
		this.ngayDay = ngayDay;
	}

	public int getKip() {
		return kip;
	}

	public void setKip(int kip) {
		this.kip = kip;
	}

	@Override
	public int compareTo(LopHoc o) {
		if(this.ngayDay == o.getNgayDay()) {
			return this.kip - o.getKip();
		}
		else return this.ngayDay - o.getNgayDay();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maNhom + " " + ngayDay + " " + kip + " " + hoTenGV + " " + 	phongHoc;
	}
}
