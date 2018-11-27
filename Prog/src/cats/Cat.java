package cats;

public class Cat {

	private int age;
	private int weight;
	private String name;
	private boolean sleep;

	public Cat(int age, int weight, String name, boolean sleep) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.sleep = sleep;
	}

	public Cat() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public boolean issleep() {
		return sleep;
	}

	public void setsleep(boolean sleep) {
		this.sleep = sleep;
	}

	public void eat() {
		weight++;
		System.out.println("I am  " + name + " I am eating and my weight will be  " + weight);

	}

	public void goToSleep() {
		System.out.println("I am  " + name + " and I gone to sleep");
		sleep = true;
	}

	public void getUp() {
		System.out.println("Hello! I am  " + name);
		sleep = false;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weight=" + weight + ", name=" + name + ", sleep=" + sleep + "]";
	}

}
