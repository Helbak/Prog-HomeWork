package PhoneNetwork;

public class MainPhoneNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneNetwork numberOne = new PhoneNetwork(1, 2, 3, 4, 5, 6, 7);

		PhoneNetwork numberTwo = new PhoneNetwork(1, 2, 3, 3, 3, 3, 3);

		PhoneNetwork numberThree = new PhoneNetwork(2, 2, 2, 2, 2, 2, 2);

		PhoneNetwork numberFour = new PhoneNetwork(0, 0, 0, 0, 0, 0, 0);

		Phones phoneOne = new Phones(false, numberOne);
		Phones phoneTwo = new Phones(false, numberTwo);
		Phones phoneThree = new Phones(false, numberThree);
		Phones phoneFour = new Phones(false, numberFour);

		numberOne.network.add(numberOne);
		numberTwo.network.add(numberTwo);
		numberThree.network.add(numberThree);

		phoneOne.registration();
		phoneTwo.registration();

		phoneOne.tryCall(numberOne);
		phoneTwo.tryCall(numberTwo);
		phoneThree.tryCall(numberThree);
		phoneFour.tryCall(numberFour);

	}

}
