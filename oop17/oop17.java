package OOP17;

import java.util.ArrayList;
import java.util.Scanner;

public class oop17 {
	 public static void main(String arg[]) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 sc.nextLine();
		 ArrayList<Hang> arr = new ArrayList<>();
		 ArrayList<Hang> result = new ArrayList<>();
		 for(int i =0; i <n; i++) {
			 
			 String maHang = sc.nextLine();
			 String tenHang = sc.nextLine();
			 String xepLoai = sc.nextLine();
			 double lai = 0;
			 if(xepLoai.equals("A")) lai = 0.08;
			 if(xepLoai.equals("B")) lai = 0.05;
			 if(xepLoai.equals("C")) lai = 0.02;
			 Hang hang = new Hang(maHang, tenHang, xepLoai, lai);
			 arr.add(hang);
		 }
		 
		 int m = sc.nextInt();
		 for(int i =0; i< m; i++) {
			 sc.nextLine();
			 String maHang = sc.next();
			 long soLuongNhap = sc.nextLong();
			 long donGiaNhap = sc.nextLong();
			 long soLuongXuat = sc.nextLong();
			 for(Hang x : arr) {
				 if(maHang.equals(x.getMaHang())) {
					 long giaTriNhap = (long) (donGiaNhap*soLuongNhap);
					 long giaTriXuat = (long) (soLuongXuat* donGiaNhap* (1 + x.getLai()));
					 Hang hang1 = new Hang(maHang, x.getTenHang(), x.getXepLoai(), x.getLai(), giaTriNhap, giaTriXuat);
					 result.add(hang1);
				 }
			 }
		 }
		 for(Hang x : result) {
			 System.out.println(x.toString());
		 }
	 }
}
//class Hang {
//	private String maHang;
//	private String tenHang;
//	private String xepLoai;
//	private double lai;
//	private long giaTriNhap;
//	private long giaTriXuat;
//	public Hang(String maHang, String tenHang, String xepLoai, double lai) {
//		super();
//		this.maHang = maHang;
//		this.tenHang = tenHang;
//		this.xepLoai = xepLoai;
//		this.lai = lai;
//	}
//	
//	public Hang(String maHang, String tenHang, String xepLoai, double lai, long giaTriNhap, long giaTriXuat) {
//		super();
//		this.maHang = maHang;
//		this.tenHang = tenHang;
//		this.xepLoai = xepLoai;
//		this.lai = lai;
//		this.giaTriNhap = giaTriNhap;
//		this.giaTriXuat = giaTriXuat;
//	}
//
//	public String getMaHang() {
//		return maHang;
//	}
//	public void setMaHang(String maHang) {
//		this.maHang = maHang;
//	}
//	public double getLai() {
//		return lai;
//	}
//	public void setLai(double lai) {
//		this.lai = lai;
//	}
//	public long getGiaTriNhap() {
//		return giaTriNhap;
//	}
//	public void setGiaTriNhap(long giaTriNhap) {
//		this.giaTriNhap = giaTriNhap;
//	}
//	public long getGiaTriXuat() {
//		return giaTriXuat;
//	}
//	public void setGiaTriXuat(long giaTriXuat) {
//		this.giaTriXuat = giaTriXuat;
//	}
//
//	public String getTenHang() {
//		return tenHang;
//	}
//
//	public void setTenHang(String tenHang) {
//		this.tenHang = tenHang;
//	}
//
//	public String getXepLoai() {
//		return xepLoai;
//	}
//
//	public void setXepLoai(String xepLoai) {
//		this.xepLoai = xepLoai;
//	}
//	
//	public String toString() {
//		return maHang + " " + tenHang + " " + giaTriNhap + " " + giaTriXuat;
//	}
//}