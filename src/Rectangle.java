
public class Rectangle extends Shape {
	int height;
	int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		setShapeName("Quadrilateral");
		setShapeType("Rectangle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * width;
	}

	@Override
	public void printDescription() {
		System.out.println("Type is " + getShapeType());
		System.out.println("The height is " + Integer.toString(height));
		System.out.println("The width is " + Integer.toString(width));

	}

}
