package OOP26;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class oop26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String name = sc.nextLine();
            String gender = sc.next();
            String dob = sc.next();
            sc.nextLine();
            String address = sc.nextLine();
            a.add(new KhachHang(name, gender, dob, address));
        }
        Collections.sort(a);
        for (KhachHang x : a) System.out.println(x);
    }
}