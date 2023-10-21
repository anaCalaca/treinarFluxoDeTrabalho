package model;

public class Square {

	private double side;

	public Square() {
		this.side = 1.0;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;

		if (side >= 0 && side <= 60) {
			this.side = side;
		} else {
			System.out.println("fora dos parametros");
		}
	}

	public double area() {
		return side * side;
	}

	public double perimetro() {
		return 4 * side;
	}

	public double diagonal() {
		return Math.sqrt(2) * side;
	}
}
