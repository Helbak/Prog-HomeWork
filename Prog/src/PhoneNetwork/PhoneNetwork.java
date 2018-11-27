package PhoneNetwork;

import java.util.ArrayList;

public class PhoneNetwork {

	private int one, two, three, four, five, six, seven;

	ArrayList<PhoneNetwork> network = new ArrayList<>();

	public PhoneNetwork(int i, int j, int k, int l, int m, int n, int o) {
		super();
		this.one = i;
		this.two = j;
		this.three = k;
		this.four = l;
		this.five = m;
		this.six = n;
		this.seven = o;
	}

	public ArrayList<PhoneNetwork> getNetwork() {
		return network;
	}

	public void setNetwork(ArrayList<PhoneNetwork> network) {
		this.network = network;
	}

	public int getOne() {
		return one;
	}

	public int getTwo() {
		return two;
	}

	public int getThree() {
		return three;
	}

	public int getFour() {
		return four;
	}

	public int getFive() {
		return five;
	}

	public int getSix() {
		return six;
	}

	public int getSeven() {
		return seven;
	}

}
