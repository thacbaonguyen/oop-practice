package oop6;

import java.util.Scanner;

public class oop6 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String maGv = sc.nextLine();
		String hoTen = sc.nextLine();
		long luongCoBan = sc.nextLong();
		int bacLuong = Integer.parseInt(maGv.substring(2));
		long phuCap = 0;
		long tongLuong;
		if(maGv.substring(0, 2).equals("HT")) {
			phuCap = 2000000;
		}
		if(maGv.substring(0, 2).equals("HP")) {
			phuCap = 900000;
		}
		if(maGv.substring(0, 2).equals("GV")) {
			phuCap = 500000;
		}
		tongLuong = luongCoBan * bacLuong + phuCap;
		Teacher teacher = new Teacher(maGv, hoTen, luongCoBan, bacLuong, phuCap, tongLuong);
		System.out.println(teacher.toString());
	}
}
