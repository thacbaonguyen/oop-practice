package oop48;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oop48 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<KhachHang> arr = new ArrayList<>();
		for(int i = 0; i <n;i ++) {
			arr.add(new KhachHang(sc.nextLine(), sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.nextLine().trim())));
		}
		Collections.sort(arr);
		for(KhachHang x : arr) System.out.println(x);
	}
}
