package oop53;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable{
	private String maSinhVien;
	private String tenSinhVien;
	private String lop;
	private Date ngaySinh;
	private float gpa;
	public SinhVien(int id, String tenSinhVien, String lop, String ngaySinh, float gpa) {
		super();
		maSinhVien = "B20DCCN" + String.format("%03d", ++id);
		this.tenSinhVien = tenSinhVien;
		this.lop = lop;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.ngaySinh = sdf.parse(ngaySinh);
		} catch (ParseException e) {
		}
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return maSinhVien + " " + tenSinhVien + " " + lop + " " + sdf.format(ngaySinh) + " " + String.format("%.2f", gpa);
	}
}
