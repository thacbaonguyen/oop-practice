package oop9;

import java.util.ArrayList;
import java.util.Scanner;

public class oop9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Person> arr = new ArrayList<>();
		for(int i =0; i<n; i++) {
			String hoVaTen = sc.nextLine();
			int luongCoBan = sc.nextInt();
			int soNgayCong = sc.nextInt();
			sc.nextLine();
			String chucVu = sc.nextLine();
			long phuCap = 0;
			float tienThuong = 0;
			if(chucVu.equals("GD")) {
				phuCap = 250000;
			}
			if(chucVu.equals("PGD")) {
				phuCap = 200000;
			}
			if(chucVu.equals("TP")) {
				phuCap = 180000;
			}
			if(chucVu.equals("NV")) {
				phuCap = 150000;
			}
			if(soNgayCong >= 25) tienThuong  = (float) 0.2;
			if(soNgayCong < 25 && soNgayCong >=22) tienThuong  = (float) 0.1;
			if(soNgayCong < 22) tienThuong  = 0;
			Person person = new Person(i + 1, hoVaTen, luongCoBan, soNgayCong, chucVu, phuCap, tienThuong);
			System.out.print(person.toString());
		}
		
	}
}
