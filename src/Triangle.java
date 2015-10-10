
public class Triangle extends Shape {
	int b;
	int h;

	public Triangle(int base, int height) {
		b = base;
		h = height;
		setShapeName("Triangle");
		setShapeType("Triangle");
	}

	@Override
	public double getArea() {

		return .5 * b * h;
	}

	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("The base is " + Integer.toString(b));
		System.out.println("The height is " + Integer.toString(h));
	}
}
