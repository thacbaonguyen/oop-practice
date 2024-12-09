package oop42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop42 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATHANG.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<MatHang> arr = new ArrayList<>();
		for(int i =0 ; i < n; i++) {
			String tenMH = sc.nextLine();
			String nhomMH = sc.nextLine();
			String giaMua = sc.nextLine();
			String giaBan = sc.nextLine();
			MatHang matHang = new MatHang(tenMH, nhomMH, giaMua, giaBan);
			arr.add(matHang);
		}
		Collections.sort(arr);
		for(MatHang x : arr) {
			System.out.println(x);
		}
	}
}
//class MatHang implements Comparable<MatHang>{
//	private String maMH, tenMH, nhomMH;
//	private double giaMua, giaBan;
//	private static int id = 0;
//	public MatHang(String tenMH, String nhomMH, String giaMua, String giaBan) {
//		super();
//		this.maMH = "MH" + String.format("%02d", ++id);
//		this.tenMH = tenMH;
//		this.nhomMH = nhomMH;
//		this.giaMua = Double.parseDouble(giaMua);
//		this.giaBan = Double.parseDouble(giaBan);
//	}
//	
//	public double getGiaMua() {
//		return giaMua;
//	}
//	public double getGiaBan() {
//		return giaBan;
//	}
//	@Override
//	public int compareTo(MatHang o) {
//		double l1 = this.giaBan - this.giaMua;
//		double l2 = o.getGiaBan() - o.getGiaMua();
//		return (int) (Math.ceil(l2 - l1));
//	}
//	@Override
//	public String toString() {
//		double loiNhuan = this.giaBan - this.giaMua;
//	return maMH + " " + tenMH + " " + nhomMH + " " + String.format("%.2f", loiNhuan);
//	}
//}
