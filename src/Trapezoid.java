
public class Trapezoid extends Shape {
	int b1;
	int b2;
	int h;

	public Trapezoid(int baseA, int baseB, int height) {
		b1 = baseA;
		b2 = baseB;
		h = height;
		setShapeName("Quadrilateral");
		setShapeType("Trapezoid");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((b1 + b2) / 2) * h;
	}

	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("The 1st base is " + Integer.toString(b1));
		System.out.println("The 2nd base is " + Integer.toString(b2));
		System.out.println("The height is " + Integer.toString(h));
	}

}
