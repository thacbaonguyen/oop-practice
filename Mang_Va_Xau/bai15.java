package Mang_Va_Xau;

import java.util.Scanner;

public class bai15 {
    public static boolean nto(int n){
        for(int i=2;i*i<=n;++i){
            if (n%i==0){
                return false;
            }
        }
        return n>1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            System.out.println(nto(n)?"YES":"NO");
        }
        scanner.close();
    }
}