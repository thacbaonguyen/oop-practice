package test2java.oop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

class Person{
	private String hoTen;
	private Date ngaySinh;
	private float diem1;
	private float diem2;
	private float diem3;
	private float tongDiem;
	public Person() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public float getDiem1() {
		return diem1;
	}
	public void setDiem1(float diem1) {
		this.diem1 = diem1;
	}
	public float getDiem2() {
		return diem2;
	}
	public void setDiem2(float diem2) {
		this.diem2 = diem2;
	}
	public float getDiem3() {
		return diem3;
	}
	public void setDiem3(float diem3) {
		this.diem3 = diem3;
	}
	public float getTongDiem() {
		return tongDiem;
	}
	public void setTongDiem(float tongDiem) {
		this.tongDiem = tongDiem;
	}
	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String result = sdf.format(this.ngaySinh);
		System.out.print(this.hoTen + " " + result + " " + this.tongDiem);
	}
}