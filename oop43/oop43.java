package oop43;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class oop43 {
	public static void main(String arg[]) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<KhachHang> arr = new ArrayList<>();
		while (n-- > 0)
            arr.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
		Collections.sort(arr);
		for(KhachHang x : arr) {
			System.out.println(x);
		}
	}
}
//class KhachHang implements Comparable<KhachHang>{
//	private String maKH, tenKH, soPhong;
//	private Date ngayNhan, ngayTra;
//	private long tienPhatSinh;
//	private long donGia, thanhTien, soNgay;
//	private static int cnt = 1;
//	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//	public KhachHang(String tenKH,  String soPhong, String ngayNhan, String ngayTra, long tienPhatSinh)
//			throws ParseException {
//		super();
//		maKH = String.format("KH%02d", cnt++);
//		tenKH = tenKH.trim().toLowerCase();
//        String[] s = tenKH.split("\\s+");
//        this.tenKH = "";
//        for (String i : s)
//            this.tenKH += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
//		this.ngayNhan = sdf.parse(ngayNhan);
//		this.ngayTra = sdf.parse(ngayTra);
//		this.tienPhatSinh = tienPhatSinh;
//		this.soPhong = soPhong;
//		if(soPhong.charAt(0) == '1') donGia = 25;
//		else if(soPhong.charAt(0) == '2') donGia = 34;
//		else if(soPhong.charAt(0) == '3') donGia = 50;
//		else if(soPhong.charAt(0) == '4') donGia = 80;
//		soNgay = ChronoUnit.DAYS.between(this.ngayNhan.toInstant(), this.ngayTra.toInstant()) + 1;
//		thanhTien = soNgay * donGia + tienPhatSinh;
//	}
//	@Override
//	public int compareTo(KhachHang o) {
//		return (int)(o.thanhTien - thanhTien);
//	}
//	@Override
//	public String toString() {
//		return maKH + " " + tenKH + soPhong + " " + soNgay + " " + thanhTien ;
//	}
//}