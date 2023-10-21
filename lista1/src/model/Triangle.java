package model;

public class Triangle {

	private double side;

	public Triangle(double side) {
		this.side = 1.0;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double area() {
		return Math.sqrt(3) / 4 * side * side;
	}

	public double perimetro() {
		return 3 * side;
	}

}
