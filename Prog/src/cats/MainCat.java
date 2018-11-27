package cats;

public class MainCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Vasya = new Cat(12, 3, "Vasya", false);
		Cat Musya = new Cat(2, 2, "Musya", false);
		Cat fromStreet = new Cat(3, 1, "noName", false);
		Vasya.eat();
		Vasya.goToSleep();
		Musya.eat();
		Musya.goToSleep();
		Musya.getUp();

		System.out.println(Vasya);
		System.out.println(Musya);
		System.out.println(fromStreet);
	}

}
