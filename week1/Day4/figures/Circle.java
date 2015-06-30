package week1.Day4.figures;

public class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
