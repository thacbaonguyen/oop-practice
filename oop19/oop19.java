package OOP19;

import java.util.ArrayList;
import java.util.Scanner;

public class oop19 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<SinhVien> arr = new ArrayList<>();
			for(int i =0; i < n; i++) {
				sc.nextLine();
				String maSinhVien = sc.nextLine();
				String hoTen = sc.nextLine();
				String soDienThoai = sc.nextLine();
				int soThuTu = sc.nextInt();
				SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, soDienThoai, soThuTu);
				arr.add(sinhVien);
			}
			sc.nextLine();
			String[] title = new String[m + 1];
			for(int i = 1; i <= m; i++) {
				title[i] = sc.nextLine();
			}
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int nhomTruyVan = sc.nextInt();
				System.out.println("DANH SACH NHOM " + nhomTruyVan + ":");
				for(SinhVien x : arr) {		
					if(nhomTruyVan == x.getSoThuTu()) {
						System.out.println(x.toString());
					}
				}
				System.out.println("Bai tap dang ky: " + title[nhomTruyVan]);
			}
	}
}
