
public abstract class Shape implements Printable {

	private String shapeType;
	private String shapeName;

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public abstract double getArea();

	public void printDescrpition() {
		System.out.println();
	}
}
