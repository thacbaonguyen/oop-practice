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
