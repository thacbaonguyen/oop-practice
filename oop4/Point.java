package oop4;

public class Point {
	private double x;
	private double y;
	public Point() {
		
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
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
	public double distance(Point secondPoint) {
		double result = Math.sqrt(Math.pow(secondPoint.x, 2) - Math.pow(secondPoint.y, 2));
		return result;
	}
	public double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	@Override
	public String toString() {
		return this.x + "" + this.y;
	}
	
}
