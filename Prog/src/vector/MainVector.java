package vector;

public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point pointA = new Point(3, 4, 3);
		Point pointB = new Point(1, 2, 3);
		Point pointC = new Point(1, 1, 3);
		Point pointD = new Point(0, -2, 3);
		Point pointE = new Point(3, -4, -3);
		Point pointF = new Point(-3, 0, 3);

		Vector vectorA = new Vector(pointA, pointB);
		Vector vectorB = new Vector(pointC, pointD);
		Vector vectorC = new Vector(pointE, pointF);
		CoordinateOfVector coordinateOfVectorEmpty = new CoordinateOfVector();

		CoordinateOfVector CoordinateOfVectorVectorA = coordinateOfVectorEmpty.coordinateOfVectors(vectorA);
		CoordinateOfVector CoordinateOfVectorVectorB = coordinateOfVectorEmpty.coordinateOfVectors(vectorB);
		CoordinateOfVector CoordinateOfVectorVectorC = coordinateOfVectorEmpty.coordinateOfVectors(vectorC);

		System.out.println("Points:  ");
		System.out.println("pointA  " + pointA);
		System.out.println("pointB  " + pointB);
		System.out.println("pointC  " + pointC);
		System.out.println("pointD  " + pointD);
		System.out.println("pointE  " + pointE);
		System.out.println("pointF  " + pointF);
		System.out.println(" ");
		System.out.println("vectorA  " + vectorA);
		System.out.println("vectorB  " + vectorB);
		System.out.println("vectorC  " + vectorC);
		System.out.println(" ");
		System.out.println("CoordinateOfVectorVectorA " + CoordinateOfVectorVectorA);
		System.out.println("CoordinateOfVectorVectorB " + CoordinateOfVectorVectorB);
		System.out.println("CoordinateOfVectorVectorC " + CoordinateOfVectorVectorC);
		System.out.println(" ");
		System.out.println("sumOfVectors A+C " + coordinateOfVectorEmpty.sumOfVectors(vectorA, vectorC));
		System.out
				.println("scolarMultiplication A*B " + coordinateOfVectorEmpty.scolarMultiplication(vectorA, vectorB));

	}

}
