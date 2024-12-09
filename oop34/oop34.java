package oop34;

import java.util.*;

//class LopHoc implements Comparable<LopHoc> {
//    private String maMH;
//    private String tenMH;
//    private String nhom;
//    private String teacherten;
//
//    public LopHoc(String maMH, String tenMH, String nhom, String teacherten) {
//        this.maMH = maMH;
//        this.tenMH = tenMH;
//        this.nhom = nhom;
//        this.teacherten = teacherten;
//    }
//
//    public String getteacherten() {
//        return teacherten;
//    }
//
//    @Override
//    public int compareTo(LopHoc o) {
//        if (!this.maMH.equals(o.maMH)) return this.maMH.compareTo(o.maMH);
//        return this.nhom.compareTo(o.nhom);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s", this.maMH, this.tenMH, this.nhom);
//    }
//}

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
