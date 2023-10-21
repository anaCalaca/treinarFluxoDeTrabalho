package view;

import model.Sphere;

public class SphereTeste {

	public static void main(String[] args) {

	Sphere esfera = new Sphere();
	
	esfera.setRsdius(40);
	esfera.getRadius();
	
	System.out.println("area: " + esfera.area());
	System.out.println("volume: " + esfera.volume());
	
	
	}	
}