package week1.Day4.figures;

public class MainComputeArea {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5, 4);
		System.out.println("Area of Rectangle is " + rec.computeArea());
		Triangle trngle = new Triangle(2, 4);
		System.out.println("Area of Triangle is " + trngle.computeArea());
		Circle circle = new Circle (10);
		System.out.printf("Area of Circle is %.2f",circle.computeArea());
	
	}
}
