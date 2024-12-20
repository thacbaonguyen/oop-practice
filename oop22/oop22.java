package OOP22;

import java.util.ArrayList;
import java.util.Scanner;

public class oop22 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<KhachHang> arr1 = new ArrayList<>();
		ArrayList<MatHang> arr2 = new ArrayList<>();
		ArrayList<HoaDon> arr3 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String tenKhachHang = sc.nextLine();
			String gioiTinh = sc.nextLine();
			String ngaySinh = sc.nextLine();
			String diaChi = sc.nextLine();
			KhachHang khachHang = new KhachHang(i + 1, tenKhachHang, gioiTinh, ngaySinh, diaChi);
			arr1.add(khachHang);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			sc.nextLine();
			String tenMatHang = sc.nextLine();
			String donVi = sc.nextLine();
			long giaMua = sc.nextLong();
			long giaBan = sc.nextLong();
			MatHang matHang = new MatHang(i + 1, tenMatHang, donVi, giaMua, giaBan);
			arr2.add(matHang);
		}
		int k = sc.nextInt();
		for(int i = 0;i < k; i++) {
			sc.nextLine();
			String maKhachHang = sc.next();
			String maMatHang = sc.next().trim();
			int soLuong = sc.nextInt();
			HoaDon hoaDon = new HoaDon(i + 1, maKhachHang, maMatHang, soLuong);
			arr3.add(hoaDon);
		}
		for(HoaDon x : arr3) {
			System.out.print(x.toString1());
			long thanhTien = 0;
			for(KhachHang y : arr1) {
				if(x.getMaKhachHang().equals(y.getMaKhachhang())) {
					System.out.print(y.toString());
				}
			}
			for(MatHang z : arr2) {
				if(x.getMaMatHang().equals(z.getMaMatHang())) {
					thanhTien = z.getGiaBan()* x.getSoLuong();
					System.out.print(z.toString());
				}
			}
			System.out.print(x.toString2());
			System.out.println(thanhTien);
		}
	}
}
