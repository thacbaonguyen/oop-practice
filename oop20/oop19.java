package OOP20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
			for(int i = 0; i < m; i++) {
				String tenDeTai = sc.nextLine();
				for(SinhVien x : arr) {
					if(x.getSoThuTu() == i + 1) {
						x.setTenDeTai(tenDeTai);
					}
				}
			}
			Collections.sort(arr, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
				}
			});
			for(SinhVien x : arr) {
				System.out.println(x.toString());
			}
	}
}
