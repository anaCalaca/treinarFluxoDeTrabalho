package view;

import model.Triangle;

public class TriangleTeste {

	public static void main(String[] args) {

		Triangle triangulo = new Triangle(0);

		triangulo.setSide(5);
		triangulo.getSide();
		
		System.out.println("Area: " + triangulo.area());
		System.out.println("Perimetro: " + triangulo.perimetro());

	}

}
