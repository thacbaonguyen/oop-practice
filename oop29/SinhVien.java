package OOP29;

import java.util.Arrays;

public class SinhVien implements Comparable<SinhVien>{
	private String maSV;
	private String hoTen;
	private String soDienThoai;
	private String email;
	public SinhVien(String maSV, String hoTen, String soDienThoai, String email) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}
	
	public String getMaSV() {
		return maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	@Override
	public int compareTo(SinhVien o) {
		String[] ten1 = this.hoTen.split("\\s+");
		String[] ten2 = o.hoTen.split("\\s+");
		if(!ten1[ten1.length - 1].equals(ten2[ten2.length - 1])) return ten1[ten1.length - 1].compareTo(ten2[ten2.length - 1]);
		if(!ten1[0].equals(ten2[0])) return ten1[0].compareTo(ten2[0]);
		if(!middleName(ten1).equals(middleName(ten2))) return middleName(ten1).compareTo(middleName(ten2));
		return this.maSV.compareTo(o.getMaSV());
	}
	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + soDienThoai + " " + email;
	}
	public String middleName(String[] str) {
		String middleName ="";
		if(str.length > 2) {
			middleName+= str[1];
			for(int i = 2; i <str.length; i ++) {
				middleName+= " " + str[i];
			}
		}
		return middleName;
	}
}
