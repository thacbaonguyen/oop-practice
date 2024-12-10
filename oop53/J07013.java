package oop53;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class J07013 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("SV.in"));
		ArrayList<SinhVien> arr = (ArrayList<SinhVien>) os.readObject() ;
		for(SinhVien x : arr) System.out.println(x);
	}
}
//class SinhVien {
//	private String maSinhVien;
//	private String tenSinhVien;
//	private String lop;
//	private Date ngaySinh;
//	private float gpa;
//	private static int cnt = 1;
//	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	public SinhVien(int id, String tenSinhVien, String lop, String ngaySinh, float gpa) {
//		super();
//		maSinhVien = "B20DCCN" + String.format("%03d", ++id);
//		this.tenSinhVien = tenSinhVien;
//		this.lop = lop;
//		try {
//			this.ngaySinh = sdf.parse(ngaySinh);
//		} catch (ParseException e) {
//		}
//		this.gpa = gpa;
//	}
//	@Override
//	public String toString() {
//			return maSinhVien + " " + tenSinhVien + " " + lop + " " + sdf.format(ngaySinh) + " " + String.format("%.2f", gpa);
//	}
//}