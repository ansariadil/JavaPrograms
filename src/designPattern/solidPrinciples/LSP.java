package designPattern.solidPrinciples;

//3 Solid Principle - Liskov Substitution Principle

//The principle defines that objects of a superclass shall be replaceable with objects of its subclasses 
//without breaking the application. That requires the objects of your subclasses to behave in the same way as the 
//objects of your superclass.

public class LSP {

}

class Rectangle {
	protected int width, height;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

}

class Square extends Rectangle {

	public Square() {
	}

	public Square(int size) {
		width = height = size;
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}

}

class RectangleFactory {
	public static Rectangle newSquare(int side) {
		return new Rectangle(side, side);
	}

	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width, height);
	}
}

class LSPDemo {
	// maybe conform to ++
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2, 3);
		useIt(rc);

		Rectangle sq = new Square();
		sq.setHeight(5);
		sq.setWidth(10);
		useIt(sq);
	}
}
