package oop55;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class oop55 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("KH.in"));
		Scanner sc2 = new Scanner(new File("MH.in"));
		Scanner sc3 = new Scanner(new File("HD.in"));
		int n = sc1.nextInt();
		sc1.nextLine();
		ArrayList<KhachHang> arr1 = new ArrayList<>();
		for(int i = 0 ; i <n ; i++) {
			arr1.add(new KhachHang(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
		}
		int m = sc2.nextInt();
		sc2.nextLine();
		ArrayList<MatHang> arr2 = new ArrayList<>();
		for(int i = 0; i < m; i ++) {
			arr2.add(new MatHang(sc2.nextLine(), sc2.nextLine(), Long.parseLong(sc2.nextLine()), Long.parseLong(sc2.nextLine())));
		}
		int k = sc3.nextInt();
		sc3.nextLine();
		ArrayList<HoaDon> arr3 = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			arr3.add(new HoaDon(sc3.next(), sc3.next().trim(), Long.parseLong(sc3.nextLine().trim())));
		}
		for(HoaDon x : arr3) {
			for(KhachHang y : arr1) {
				if(x.getMaKH().equals(y.getMaKhachHang())) {
					x.setDiaChi(y.getDiaChi());
					x.setHoTenKH(y.getTenKhachHang());
				}
			}
			for(MatHang z : arr2) {
				if(z.getMaMatHang().equals(x.getMaMH())) {
					x.setGiaBan(z.getGiaBan());
					x.setGiaMua(z.getGiaMua());
					x.setTenMatHang(z.getTenMatHang());
					x.setDonViTinh(z.getDonViTinh());
				}
			}
		}
		for(HoaDon x : arr3) System.out.println(x);
	}
}