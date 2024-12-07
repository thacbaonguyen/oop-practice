package test2java.oop3;

import java.util.Scanner;

public class oop3 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		String color = sc.nextLine();
		color = color.trim();
		color = color.toLowerCase();
		color = color.substring(0, 1).toUpperCase() + color.substring(1);
		if(width <= 0 || height <= 0) System.out.print("INVALID");
		else {
			Rectange rectange = new Rectange();
			rectange.setWidth(width);
			rectange.setHeight(height);
			rectange.setColor(color);
			System.out.print(rectange.toString());
		}
	}
}
