package jp;

class Rectangle {
	private double length;
	double width;
	public int height;

	public void setRectangle(double x, double y) {
		this.length = x;
		this.width = y;
	}

	public double getArea() {
		return length * width;

	}
}

class Box extends Rectangle {
	private double height;

	public void setBox(double length, double width, double height) {
		setRectangle(length, width);
		this.height = height;

	}

	public double getVolume() {
		return getArea() * height;
	}
}

public class Rectangleanswer {
	public static void main(String[] args) {
		Box room= new Box();
		room.setBox(5,5,5);
		System.out.println("volume is " + room.getVolume());

	}

}
