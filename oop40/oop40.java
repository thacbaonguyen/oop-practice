package oop40;

import java.util.*;


public class oop40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a=new NhanVien(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        System.out.println(a);
        sc.close();
    }
}
