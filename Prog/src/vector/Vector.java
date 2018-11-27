package vector;

public class Vector {
	private Point pointA;
	private Point pointB;

	public Vector(Point pointA, Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@Override
	public String toString() {
		return "Vector [pointA=" + pointA + ", pointB=" + pointB + "]";
	}

}
