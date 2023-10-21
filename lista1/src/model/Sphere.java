package model;

public class Sphere {
	private double radius;

	public Sphere() {
		this.radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRsdius(double radius) {
		this.radius = radius;

		if (radius >= 0 && radius <= 60) {
			this.radius = radius;
		} else {
			System.out.println("fora dos parametros");
		}
	}

	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	public double volume() {
		return 4 / 3 * Math.PI * radius * radius * radius;
	}

}
