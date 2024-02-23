package edu.unlv.mis768.labwork11;

public class Cube extends Rectangle {
	
	private double height;
	
	public Cube (double l, double w, double h) {
		super(l, w);
		height=h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return getArea() * height;
	}
}
