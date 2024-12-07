package oop14;

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
		Collections.sort(result, new Comparator<FootballClub>() {

			@Override
			public int compare(FootballClub o1, FootballClub o2) {
				long dt1 = o1.getGiaVe()* o1.getSoCdv();
				long dt2 = o2.getGiaVe()* o2.getSoCdv();
				if(dt1 != dt2) return (int)(dt2 - dt1);
				else return o1.getTenClb().compareTo(o2.getTenClb());
			}
		});
		for(FootballClub x : result) {
			System.out.println(x.toString());
		}
	}
}
//class FootballClub {
//	private String maClb;
//	private String tenClb;
//	private long giaVe;
//	private String maTranDau;
//	private long soCdv;
//	private int thuTu;
//	public FootballClub(String maClb, String tenClb, long giaVe) {
//		super();
//		this.maClb = maClb;
//		this.tenClb = tenClb;
//		this.giaVe = giaVe;
//	}
//	
//	public FootballClub(String maClb, String tenClb, long giaVe, String maTranDau, long soCdv, int thuTu) {
//		super();
//		this.maClb = maClb;
//		this.tenClb = tenClb;
//		this.giaVe = giaVe;
//		this.maTranDau = maTranDau;
//		this.soCdv = soCdv;
//		this.thuTu = thuTu;
//	}
//
//	public String getMaClb() {
//		return maClb;
//	}
//
//	public String getTenClb() {
//		return tenClb;
//	}
//
//	public long getGiaVe() {
//		return giaVe;
//	}
//	public int getThuTu() {
//		return thuTu;
//	}
//	
//	public long getSoCdv() {
//		return soCdv;
//	}
//	public String toString() {
//		long doanhThu = soCdv* giaVe;
//		return maTranDau + " " + tenClb + " " + doanhThu;
//	}
//}
