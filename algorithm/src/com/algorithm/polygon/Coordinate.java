package com.algorithm.polygon;

public class Coordinate {

	private double x;
	
	private double y;
	
	public Coordinate(){

	}
	public Coordinate(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double d) {
		this.x = d;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
