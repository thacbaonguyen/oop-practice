package oop8;

import java.util.Scanner;

public class oop8 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>=0) {
			double x1, x2, x3, y1, y2, y3;
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			if((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
				System.out.println("INVALID");
			}
			else {
				Point p1 = new Point(x1, y1);
				Point p2 = new Point(x2, y2);
				Point p3 = new Point(x3, y3);
				double S = p1.solveS(p1.distance(p2), p1.distance(p3), p2.distance(p3));
				double R = (p1.distance(p2)*p1.distance(p3)*p2.distance(p3))/(4*S);
				System.out.println(String.format("%.3f", Math.PI*R*R));
			}
			--n;
		}
	}
}
