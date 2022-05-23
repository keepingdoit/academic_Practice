package p10;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		bus.run();
		taxi.run();
		System.out.println(bus.name);
		System.out.println(taxi.name);
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle v1 = new Vehicle(); //ºÎ¸ð°´Ã¼
		Vehicle v2 = bus;
		System.out.println(v2.speed);
		v2.run();
		
		
	}

}
