package oop34;

import java.util.*;


public class oop34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<LopHoc> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String maMH = sc.next();
            sc.nextLine();
            String tenMH = sc.nextLine();
            String nhom = sc.next();
            sc.nextLine();
            String teacherten = sc.nextLine();
            a.add(new LopHoc(maMH, tenMH, nhom, teacherten));
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String ten = sc.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n", ten);
            for (LopHoc x : a)
                if (x.gettenGV().equals(ten)) System.out.println(x);
        }
        sc.close();
    }
}
