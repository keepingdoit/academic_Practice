package Classs;

public class Car_ex {
 //������ �����ε�
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("�ƹݶ�");
		Car car3 = new Car("�ҳ�Ÿ", "���");
		Car car4 = new Car("�׷���", "���", 300);
		Car car5 = new Car(486524);
		
		System.out.println(car1.name);
		System.out.println(car2.model);
		System.out.println(car3.color);
		System.out.println(car4.color);
		System.out.println(car5.max);
		
	}

}
