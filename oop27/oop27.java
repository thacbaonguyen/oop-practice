package OOP27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop27 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		Scanner sc2 = new Scanner(new File("LICHGD.in"));
		int k = sc.nextInt();
		ArrayList<MonHoc> arr1 = new ArrayList<>();
		for(int i = 0; i < k; i ++) {
			String maMon = sc.next();
			sc.nextLine();
			String tenMon = sc.nextLine();
			int soTinChi = sc.nextInt();
			MonHoc monHoc = new MonHoc(maMon, tenMon, soTinChi);
			arr1.add(monHoc);
		}
//		for(MonHoc x : arr1)
//			System.out.println(x.getMaMon());
		int n = sc2.nextInt();
		
		ArrayList<LopHoc> arr2 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String maMon = sc2.next();
			int ngayDay = sc2.nextInt();
			int kip = sc2.nextInt();
			sc2.nextLine();
			String hoTenGV = sc2.nextLine();
			String phongHoc = sc2.next();
			LopHoc lopHoc = new LopHoc(maMon, ngayDay, kip, hoTenGV, phongHoc);
			arr2.add(lopHoc);
		}
		String maMH = sc2.next();
		for(MonHoc x : arr1) {
			if(maMH.equals(x.getMaMon())) System.out.println("LICH GIANG DAY MON " + x.getTenMon() +":");
		}
		Collections.sort(arr2);
		for(LopHoc x : arr2) {
			if(maMH.equals(x.getMaMon())) {
				System.out.println(x.toString());
			}
		}
		sc.close();
		sc2.close();
	}
}
