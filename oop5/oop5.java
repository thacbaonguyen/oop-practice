package oop5;

import java.util.Scanner;

public class oop5 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n >= 0) {
			double x1, x2, x3, y1, y2, y3;
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			if((x1 == x2 && x1 == x3) || (y1 == y2 && y2 == y3)) {
				System.out.println("INVALID");
			}
			else {
				Point p1 = new Point();
				Point p2 = new Point();
				Point p3 = new Point();
				p1.setX(x1);
				p2.setX(x2);
				p3.setX(x3);
				p1.setY(y1);
				p2.setY(y2);
				p3.setY(y3);
				double result = p1.distance(p2) + p2.distance(p3) + p1.distance(p3);
				System.out.println(String.format("%.3f", result));
				--n;
			}
		}
	}
}
