package Test;

public class Square extends GeometricObject implements Colorable, Comparable<Square> {

	// instance variable
	private double side;

	// no-arg constructor
	public Square() {

		side = 0;
	}

	// * constructor with argument *?
	public Square(double side) {
		this.side = side;
	}

	// getter setter for side
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// showing color
	@Override
	public void howToColor() {
		System.out.println(getColor() + " Color all four sides");
	}

	// calculating and returning area
	@Override
	public double getArea() {

		return side * side;
	}

	// calculating and returning perimeter
	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	// comparing on the basis of sides
	@Override
	public int compareTo(Square o) {
		return (o.side > side) ? 1 : -1;
	}

}
