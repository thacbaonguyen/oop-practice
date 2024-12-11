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