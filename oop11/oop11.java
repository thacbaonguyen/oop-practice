package OOP11;

import java.util.ArrayList;
import java.util.Scanner;

public class oop11 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Teacher> arr = new ArrayList<>();
		int countHT = 0, countHP = 0;
		for(int i =0; i < n; i++) {
			sc.nextLine();
			String maNgach = sc.nextLine();
			String hoTen = sc.nextLine();
			long luongCoBan = sc.nextLong();
			long phuCap = 0;
			int bacLuong = 0;
			String capBac = "";
			if(maNgach.substring(0, 2).equals("HT")) {
				phuCap = 2000000;
				++countHT;
				capBac = "HT";
			}
			if(maNgach.substring(0, 2).equals("HP")) {
				phuCap = 900000;
				++countHP;
				capBac = "HP";
			}
			if(maNgach.substring(0, 2).equals("GV")) {
				phuCap = 500000;
			}
			bacLuong = Integer.parseInt(maNgach.substring(maNgach.length() - 2));
			if((capBac.equals("HP") && countHP > 2) || (capBac.equals("HT") && countHT > 1)) {
			}
			else {
				Teacher teacher = new Teacher(maNgach, hoTen, luongCoBan, phuCap, bacLuong);
				arr.add(teacher);
			}
		}
		for(Teacher x : arr) {
			System.out.println(x.toString());
		}
	}
}