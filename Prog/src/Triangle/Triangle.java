package Triangle;

public class Triangle {
	private double a;
	private double b;
	private double c;
	private double area;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double calculateArea() {
		double l = a;
		double m = b;
		double n = c;
		double p = (m + n + l) / 2;
		area = Math.sqrt(p * (p - l) * (p - m) * (p - n));
		return area;
	}
}
