package OOP13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class oop13 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<FootballClub> arr = new ArrayList<>();
		ArrayList<FootballClub> result = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String maClb = sc.nextLine();
			String tenClb = sc.nextLine();
			long giaVe = sc.nextLong();
			FootballClub fc = new FootballClub(maClb, tenClb, giaVe);
			arr.add(fc);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			sc.nextLine();
			String maTranDau = sc.next();
			long soCdv = sc.nextLong();
			String name = maTranDau.substring(1, 3);
			for(FootballClub x : arr) {
				if(x.getMaClb().equals(name)) {
//					x.setMaTranDau(maTranDau);
//					x.setSoCdv(soCdv);
//					x.setThuTu(Integer.parseInt(maTranDau.substring(maTranDau.length() - 1)));
					int thuTu = Integer.parseInt(maTranDau.substring(maTranDau.length() - 1));
					FootballClub fc2 = new FootballClub(x.getMaClb(), x.getTenClb(), x.getGiaVe(), maTranDau, soCdv, thuTu);
					result.add(fc2);
				}
			}
			
		}
//		Collections.sort(result, new Comparator<FootballClub>() {
//
//			@Override
//			public int compare(FootballClub o1, FootballClub o2) {
//				return o1.getThuTu() - o2.getThuTu();
//			}
//		});
		for(FootballClub x : result) {
			System.out.println(x.toString());
		}
	}
}
