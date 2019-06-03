package Cherepaha;

public class Cherepaha {

	private String name;
	private int speed;
	private int vaga;
	private int size;
	private int price;
	protected int type;                                                                                          
	protected String color;
	static int location = 0;

	public Cherepaha(String name, int speed, int vaga) {
		this(name, speed, vaga, 0, 0, 0, null);
	}

	public Cherepaha(String name, int speed, int vaga, int size, int price, int type, String color) {
		setName(name);
		setSpeed(speed);
		setVaga(vaga);
		setSize(size);
		setPrice(price);
		setType(type);
		setColor(color);
	}

	void printStaticLocation() {
		System.out.println("Location - " + location);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getVaga() {
		return vaga;
	}

	public void setVaga(int vaga) {
		this.vaga = vaga;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getLocation() {
		return location;
	}

	public static void setLocation(int location) {
		Cherepaha.location = location;
	}

	void printLocation() {
		System.out.println("Location - " + location);
	}

	
	

	@Override
	public String toString() {
		return "Cherepaha [name=" + name + ", speed=" + speed + ", vaga=" + vaga + ", size=" + size + ", price=" + price
				+ ", type=" + type + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Cherepaha aha = new Cherepaha("   ¿ı‡", 50, 25);
		System.out.println("Name -" + aha.getName());
		System.out.println("Weight -" + aha.getVaga() + "    " + "gr");
		System.out.println("Speed -" + aha.getSpeed() + "    " + "km/h");
		System.out.println("Location" + aha.toString());

		Cherepaha back = new Cherepaha("   back", 55, 30);
		System.out.println("Name -" + back.getName());
		System.out.println("Weight -" + back.getVaga() + "    " + "gr");
		System.out.println("Speed -" + back.getSpeed() + "    " + "km/h");

		Cherepaha up = new Cherepaha("   Up", 60, 35);
		System.out.println("Name -" + up.getName());
		System.out.println("Weight -" + up.getVaga() + "    " + "gr");
		System.out.println("Speed -" + up.getSpeed() + "    " + "km/h");

		Cherepaha jorik = new Cherepaha("   Jorik", 65, 40);
		System.out.println("Name -" + jorik.getName());
		System.out.println("Weight -" + jorik.getVaga() + "    " + "gr");
		System.out.println("Speed -" + jorik.getSpeed() + "    " + "km/h");

		Cherepaha jessi = new Cherepaha("   Jessi", 70, 45);
		System.out.println("Name -" + jessi.getName());
		System.out.println("Weight -" + jessi.getVaga() + "    " + "gr");
		System.out.println("Speed -" + jessi.getSpeed() + "    " + "km/h");

	}

}
