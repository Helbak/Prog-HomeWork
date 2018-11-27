package vector;

public class CoordinateOfVector {

	private int xV;
	private int yV;
	private int zV;
	private int multi;
	
	public CoordinateOfVector(int xV, int yV, int zV) {
		super();
		this.xV = xV;
		this.yV = yV;
		this.zV = zV;
	}

	
	
	public CoordinateOfVector() {
		super();
	}



	public int getxV() {
		return xV;
	}

	public void setxV(int xV) {
		this.xV = xV;
	}

	public int getyV() {
		return yV;
	}

	public void setyV(int yV) {
		this.yV = yV;
	}

	public int getzV() {
		return zV;
	}

	public void setzV(int zV) {
		this.zV = zV;
	}
	
	public CoordinateOfVector sumOfVectors(Vector A, Vector B) {
		xV=A.getPointB().getX()+B.getPointA().getX();
		yV=A.getPointB().getY()+B.getPointA().getY();
		zV=A.getPointB().getZ()+B.getPointA().getZ();
		CoordinateOfVector sum= new CoordinateOfVector(xV, yV, zV);
	return sum;
}

	public int scolarMultiplication(Vector A, Vector B) {
		multi = A.getPointB().getX()*B.getPointA().getX()+ A.getPointB().getY()*B.getPointA().getY()+A.getPointB().getZ()+B.getPointA().getZ();
		return multi;
	}
	
	public CoordinateOfVector coordinateOfVectors(Vector m) {
		xV=m.getPointB().getX()-m.getPointA().getX();
		yV=m.getPointB().getY()-m.getPointA().getY();
		zV=m.getPointB().getZ()-m.getPointA().getZ();
		CoordinateOfVector n= new CoordinateOfVector(xV, yV, zV);

		return n;
	}


	@Override
	public String toString() {
		return "CoordinateOfVector [xV=" + xV + ", yV=" + yV + ", zV=" + zV + "]";
	}
	
}
