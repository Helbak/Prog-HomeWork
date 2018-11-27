package Triangle;

public class MainTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle one = new Triangle(2, 3, 4);
		Triangle two = new Triangle(2, 2, 2);
		Triangle three = new Triangle(3, 4, 2);

		System.out.println(one.calculateArea());
		System.out.println(two.calculateArea());
		System.out.println(three.calculateArea());
	}

}
