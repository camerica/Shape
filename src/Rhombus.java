
public class Rhombus extends Shape {
	int d1;
	int d2;

	public Rhombus(int diagonalA, int diagonalB) {
		d1 = diagonalA;
		d2 = diagonalB;
		setShapeName("Quadrilateral");
		setShapeType("Rhombus");
	}

	@Override
	public double getArea() {

		return (d1 * d2) / 2;
	}

	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("The 1st diagonal is " + Integer.toString(d1));
		System.out.println("The 2nd Diagonal is " + Integer.toString(d2));

	}

}
