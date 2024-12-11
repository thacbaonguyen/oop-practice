package oop57;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class oop57 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("MONHOC.in"));
		Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
		Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
		int n = sc1.nextInt();
		sc1.nextLine();
		ArrayList<MonHoc> arr1 = new ArrayList<>();
		for(int i = 0 ; i < n; i ++) {
			arr1.add(new MonHoc(sc1.next(), sc1.nextLine().trim()));
		}
		int m = sc2.nextInt();
		sc2.nextLine();
		ArrayList<GiangVien > arr2 = new ArrayList<>();
		for(int i = 0 ; i < m; i++) {	
			arr2.add(new GiangVien(sc2.next(), sc2.nextLine().trim()));
		}
		int k = sc3.nextInt();
		sc3.nextLine();
		ArrayList<GioChuan> arr3 = new ArrayList<>();
		for(int i = 0 ; i < k ; i++) {
			arr3.add(new GioChuan(sc3.next(), sc3.next().trim(), Double.parseDouble(sc3.nextLine().trim())));
		}
		for(GiangVien x : arr2) {
			System.out.print(x.toString());
			double tongGio = 0;
			for(GioChuan y : arr3) {
				if(x.getMaGV().equals(y.getMaGV())) tongGio+= y.getGioChuan();
			}
			System.out.println(String.format("%.2f", tongGio));
		}
	}
}