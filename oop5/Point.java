package oop5;

public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	public double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	public String toString() {
		return this.x + "" + this.y;
	}
}
