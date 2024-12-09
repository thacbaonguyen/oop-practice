package oop48;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop48 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<KhachHang> arr = new ArrayList<>();
		for(int i = 0; i <n;i ++) {
			arr.add(new KhachHang(sc.nextLine(), sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.nextLine().trim())));
		}
		Collections.sort(arr);
		for(KhachHang x : arr) System.out.println(x);
	}
}
//class KhachHang implements Comparable<KhachHang>{
//	private String maKhachHang;
//	private String hoTen;
//	private String loaiGiaDinh;
//	private long chiSoDau, chiSoCuoi, soDien, dinhMuc;
//	private long tienTrongDM, tienVuotDM, tongTien, VAT;
//	private static int cnt = 1;
//	public KhachHang(String hoTen, String loaiGiaDinh, long chiSoDau, long chiSoCuoi) {
//		super();
//		maKhachHang = "KH" + String.format("%02d", cnt++);
//		hoTen = hoTen.toLowerCase();
//		String s[] = hoTen.trim().split("\\s+");
//		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
//		for(int i = 1 ; i < s.length; i++) this.hoTen += " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
//		this.loaiGiaDinh = loaiGiaDinh;
//		this.chiSoDau = chiSoDau;
//		this.chiSoCuoi = chiSoCuoi;
//		if(loaiGiaDinh.equals("A")) dinhMuc = 100;
//		if(loaiGiaDinh.equals("B")) dinhMuc = 500;
//		if(loaiGiaDinh.equals("C")) dinhMuc = 200;
//		soDien = chiSoCuoi - chiSoDau;
//		if(soDien < dinhMuc) {
//			tienTrongDM = soDien* 450;
//			tienVuotDM = 0;
//		}
//		else if(soDien > dinhMuc) {
//			tienTrongDM = dinhMuc* 450;
//			tienVuotDM = (soDien - dinhMuc)* 1000;
//		}
//		VAT = (long) (0.05* tienVuotDM);
//		tongTien = (long) (tienTrongDM + tienVuotDM + VAT);
//	}
//	@Override
//	public int compareTo(KhachHang o) {
//		return Long.compare(o.tongTien, tongTien);
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return maKhachHang + " " + hoTen + " " + tienTrongDM + " " + tienVuotDM + " " + VAT + " " + tongTien;
//	}
//}
