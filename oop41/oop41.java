package oop41;

import java.util.*;

public class oop41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
        String id = sc.next();
        sc.nextLine();
        String hoTen = sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        ThiSinh a = new ThiSinh(id, hoTen, toan, ly, hoa);
        a.settrangThai(a.getTotalMark() >= 24f ? "TRUNG TUYEN" : "TRUOT");
        System.out.println(a);
    }
}