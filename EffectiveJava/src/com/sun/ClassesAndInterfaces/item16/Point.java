package com.sun.ClassesAndInterfaces.item16;

//minimizing the variable accessiblity so that the state of variable is not modified

//Never a good idea for a public class to expose fields directly. Less harmful if fields are immutable

class Point {
	
	private double x;
	private double y;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public double getX() {return x;}
	
	public double getY() {return y;}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y) {
		this.y=y;
	}

}
