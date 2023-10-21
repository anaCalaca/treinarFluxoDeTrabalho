package view;

import model.Square;

public class SquareTeste {

	public static void main(String[] args) {

		Square quadrado = new Square();
		
		quadrado.setSide(8);
		
		System.out.println("AREA: " + quadrado.area());
		System.out.println("DIAGONAL: "+ quadrado.diagonal());
		System.out.println("PERIMETRO: " + quadrado.perimetro());
		
		
		
		
	}

}
