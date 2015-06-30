package week1.Day4.figures;

public class Rectangle {
	
	double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height= height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return width * height;
	}
}
