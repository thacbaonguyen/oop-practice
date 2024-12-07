package oop2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.text.DateFormatter;

public class Student {
	private String maSv;
	private String hoTen;
	private LocalDate ngaySinh;
	private String lop;
	private float gpa;
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public Student() {
		this.maSv = "";
		this.hoTen = "";
		this.lop = "";
		this.gpa = 0;
	}
	public void print() {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		LocalDate birthDay = LocalDate.parse(this.ngaySinh, dtf);
		System.out.print(this.maSv);
		System.out.print(" " + String.format("%s", this.hoTen));
		System.out.print(" " + String.format("%s", this.lop));
		System.out.print(" " + this.ngaySinh);
		System.out.print(" " + String.format("%.2f", this.gpa) + " ");
		System.out.println();
	}
	
}
