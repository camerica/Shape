
public class Circle extends Shape {
	private int r;

	public Circle(int radius) {
		r = radius;
		setShapeName("Circle");
		setShapeType("Circle");
	}

	@Override
	public double getArea() {

		return 3.14 * (r ^ 2);
	}

	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("The radius is " + Integer.toString(r));

	}

}
