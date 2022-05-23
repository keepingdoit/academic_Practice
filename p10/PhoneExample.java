package p10;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("È«±æµ¿");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		smartphone.owner = "È«±æ¼ø";
		System.out.println(smartphone.owner);
		smartphone.sound();
	}

}
