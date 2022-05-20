package p1;

public class Car_ex {

	public static void main(String[] args) {
		Car_getter_setter car = new Car_getter_setter();
		car.setSpeed(-50);
		System.out.println(car.getSpeed());
		car.setSpeed(60);
		System.out.println(car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
	}

}
