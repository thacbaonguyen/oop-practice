package oop38;

import java.util.*;

public class oop38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
        int t=sc.nextInt();
        while(t-->0){
            Point a=new Point(sc.nextDouble(),sc.nextDouble());
            Point b=new Point(sc.nextDouble(),sc.nextDouble());
            Point c=new Point(sc.nextDouble(),sc.nextDouble());
            double d1=a.distance(b);
            double d2=b.distance(c);
            double d3=c.distance(a);
            if (d1+d2>d3&&d2+d3>d1&&d3+d1>d2){
                double r=(d1*d2*d3)/(Math.sqrt(d1+d2+d3)*Math.sqrt(d1+d2-d3)*Math.sqrt(d2+d3-d1)*Math.sqrt(d3+d1-d2));
                System.out.printf("%.3f\n",Math.PI*r*r);
            }
            else System.out.println("INVALID");
        }
        sc.close();
    }
}
