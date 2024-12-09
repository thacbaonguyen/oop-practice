package oop45;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class oop45 {
	public static void main(String arg[]) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner sc = new Scanner(new File("XETTUYEN.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<ThiSinh> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		for(ThiSinh x : arr) System.out.println(x);
	}
}
class ThiSinh {
	private String maThiSinh;
	private String hoTen;
	private Date ngaySinh;
	private double diemLyThuyet, diemThucHanh;
	private int tuoi;
	private int diemTB;
	private String xepLoai;
	private double diemThuong;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static int cnt = 1;
	public ThiSinh(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) throws ParseException {
		super();
		maThiSinh = "PH" + String.format("%02d", cnt++);
		hoTen = hoTen.toLowerCase();
		String s[] = hoTen.trim().split("\\s+");
		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
		for(int i = 1; i < s.length; i++) this.hoTen += " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
		this.ngaySinh = sdf.parse(ngaySinh);
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
		tuoi = 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4));
		if(diemLyThuyet >= 8 && diemThucHanh >=8) diemThuong = 1;
		else if(diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) diemThuong = 0.5;
		else diemThuong = 0;
		diemTB = (int) (Math.round((diemLyThuyet + diemThucHanh)*1/2) + diemThuong);
		if(diemTB == 11) diemTB = 10;
		if(diemTB < 5) xepLoai = "Truot";
		else if(diemTB >= 5 && diemTB <= 6) xepLoai = "Trung binh";
		else if(diemTB == 7) xepLoai = "Kha";
		else if(diemTB == 8) xepLoai = "Gioi";
		else if(diemTB == 9 || diemTB == 10) xepLoai = "Xuat sac";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maThiSinh + " " + hoTen + " " + tuoi + " " + diemTB + " " + xepLoai;
	}
	
}
