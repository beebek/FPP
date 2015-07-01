package week2.Day1.Q3;

public class Rectangle extends GeometricObject {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width =width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
