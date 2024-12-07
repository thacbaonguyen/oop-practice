package test2java.oop4;

import java.util.Scanner;

public class oop4 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			Point point1 = new Point();
			Point point2 = new Point();
			point1.setX(x1);
			point1.setY(y1);
			point2.setX(x2);
			point2.setY(y2);
			System.out.println(String.format("%.4f", point1.distance(point1, point2)));
			--n;
		}
	}
}
