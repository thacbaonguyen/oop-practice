package OOP18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oop18 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<NhanVien> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		for(int i =0; i <n; i++) {
			String phongBan = sc.nextLine();
			arr2.add(phongBan);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			sc.nextLine();
			String maNhanVien = sc.nextLine();
			String hoVaTen  = sc.nextLine();
			long luongCoBan = sc.nextLong();
			int soNgayCong = sc.nextInt();
			String phongBan = "";
			for(String x : arr2) {
				if(maNhanVien.substring(maNhanVien.length() - 2).equals(x.substring(0, 2))) {
					phongBan = x.substring(3);
				}
			}
			String phanLoai = maNhanVien.substring(0, 1);
			int namCongTac = Integer.parseInt(maNhanVien.substring(1, 3));
			int heSo = 0;
			Map<String, int[]> map = new HashMap<>();
			map.put("A", new int[] {10, 12, 14, 20});
			map.put("B", new int[] {10, 11, 13, 16});
			map.put("C", new int[] {9, 10, 12, 14});
			map.put("D", new int[] {8, 9, 11, 13});
			int index = 0;
			if(namCongTac >= 1 && namCongTac <=3) index = 0;
			if(namCongTac >= 4 && namCongTac <=8) index =1;
			if(namCongTac >= 9 && namCongTac <=15) index = 2;
			if(namCongTac >= 16) index = 3;
			heSo = map.get(phanLoai)[index];

			NhanVien nhanVien = new NhanVien(maNhanVien, hoVaTen, luongCoBan, soNgayCong, phongBan, heSo);
			arr.add(nhanVien);
		}
		for(NhanVien x : arr) {
			System.out.println(x.toString());
		}

	}
}
