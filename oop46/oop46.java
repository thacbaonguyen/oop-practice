package oop46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop46 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<SinhVien> arr = new ArrayList<>();
		for(int i = 0; i < n; i ++) {
			arr.add(new SinhVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(arr);
		int rank = 1;
        arr.get(0).setXepHang(rank);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).getDiemTrungBinh() == arr.get(i - 1).getDiemTrungBinh()) {
                arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
            } else {
                rank = i + 1;
                arr.get(i).setXepHang(rank);
            }
        }
		for(SinhVien x : arr) System.out.println(x);
	}
}
