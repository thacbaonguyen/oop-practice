package OOP24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class oop24 {
	public static void main(String arg[]) throws IOException {
		try {
			FileReader fr = new FileReader("SINHVIEN.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			ArrayList<String> arr = new ArrayList<>();
			while(true) {
				line = br.readLine();
				if(line == null) break;
//				System.out.println(line);
				arr.add(line);
			}
			int testCase = Integer.parseInt(arr.get(0));
			ArrayList<SinhVien> result = new ArrayList<>();
			for(int i = 1; i <= testCase; i++) {
				String hoTen = arr.get(1).toLowerCase();
				arr.remove(1);
				String lop = arr.get(1);
				arr.remove(1);
				String ngaySinh = arr.get(1);
				arr.remove(1);
				double gpa = Double.parseDouble(arr.get(1));
				arr.remove(1);
				String a[] = hoTen.split("\\s+");
				String newHoTen = "";
				for(String x : a) {
					newHoTen += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
				}
				StringBuilder sb = new StringBuilder(ngaySinh);
				if(sb.charAt(1) == '/') sb.insert(0, "0");
				if(sb.charAt(4) == '/') sb.insert(3, "0");
				SinhVien sinhVien = new SinhVien(i, newHoTen, lop, sb.toString(), gpa);
				result.add(sinhVien);
			}
			for(SinhVien x : result) {
				System.out.println(x.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//class SinhVien {
//	private String maSinhVien;
//	private String hoTen;
//	private String lop;
//	private String ngaySinh;
//	private double gpa;
//	public SinhVien(int id, String hoTen, String lop, String ngaySinh, double gpa) {
//		super();
//		this.maSinhVien = "B20DCCN" + String.format("%03d", id);
//		this.hoTen = hoTen;
//		this.lop = lop;
//		this.ngaySinh = ngaySinh;
//		this.gpa = gpa;
//	}
//	@Override
//	public String toString() {
//		return maSinhVien + " " + hoTen + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
//	}
//}
