package p10;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		smartphone.owner = "ȫ���";
		System.out.println(smartphone.owner);
		smartphone.sound();
	}

}
