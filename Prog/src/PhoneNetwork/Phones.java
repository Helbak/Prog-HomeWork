package PhoneNetwork;

import java.util.ArrayList;

public class Phones {
	private boolean registered;
	private PhoneNetwork number;
	private boolean exist;

	public Phones(boolean registered, PhoneNetwork number) {
		super();
		this.registered = registered;
		this.number = number;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public PhoneNetwork getNumber() {
		return number;
	}

	public void setNumber(PhoneNetwork number) {
		this.number = number;
	}

	public void registration() {

		registered = true;
	}

	public void tryCall(PhoneNetwork a) {
		ArrayList<PhoneNetwork> net = a.getNetwork();
		exist = net.contains(getNumber());
		if (registered == false && exist == false) {
			System.out.println("This phone is not registered and number does not exist in  the list");
		}
		if (registered == false && exist == false) {
			System.out.println("Number exist in  the list but this phone is not registered");
		}
		if (registered == true && exist == true) {
			System.out.println("... calling number " + number);
//			не смог настроить печать номера телефона, пробовал number, getNumber...  
		}

	}

	@Override
	public String toString() {
		return "Phones [number=" + number + "]";
	}

}
