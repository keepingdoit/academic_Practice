package Classs;

public class Car_ex {
 //생성자 오버로딩
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("아반떼");
		Car car3 = new Car("소나타", "흰색");
		Car car4 = new Car("그랜저", "흰색", 300);
		Car car5 = new Car(486524);
		
		System.out.println(car1.name);
		System.out.println(car2.model);
		System.out.println(car3.color);
		System.out.println(car4.color);
		System.out.println(car5.max);
		
	}

}
